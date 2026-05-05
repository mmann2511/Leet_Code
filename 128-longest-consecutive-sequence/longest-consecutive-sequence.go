func longestConsecutive(nums []int) int {
    set := make(map[int]bool)

    for _, num := range nums {
        set[num] = true
    }

    var longest int

    for num := range set {
        currStreak := 0
        if !set[num-1] {
            currNum := num
            for set[currNum] {
                currStreak ++
                currNum ++
            } 
            if currStreak > longest {
            longest = currStreak
            }
        }
        
    }
    return longest


}