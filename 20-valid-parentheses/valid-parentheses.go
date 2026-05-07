func isValid(s string) bool {
    pairs := map[rune]rune {
        ')': '(',
        ']': '[',
        '}': '{',
    }

    var stack []rune
    
    for _, char := range s {
        if open, isClosing := pairs[char]; isClosing {
            if len(stack) == 0 || stack[len(stack)-1] != open {
                return false
            }

            stack = stack[:len(stack)-1]
        } else {
            stack = append(stack, char)
        }
    }

    return len(stack) == 0


}