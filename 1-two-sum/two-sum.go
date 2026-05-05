func twoSum(nums []int, target int) []int {
    m := make(map[int]int)

    for index, num := range nums {
        if prevIndex, exists := m[num]; exists {
            return []int{prevIndex, index}
        }
        m[target - num] = index
    }
    return []int{-1}
}