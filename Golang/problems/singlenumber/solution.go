package singlenumber

// SingleNumber finds the single number in an array where every other number appears twice.
func SingleNumber(nums []int) int {
	if len(nums) == 0 {
		return 0 // Return 0 if the input slice is empty
	}

	result := 0
	for _, nums := range nums {
		result ^= nums // XOR operation
	}
	return result
}
