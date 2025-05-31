package singlenumber

import "testing"

// SingleNumber finds the single number in an array where every other number appears twice.
// It uses the XOR operation to find the unique number.

func TestSingleNumber(t *testing.T) {
	got := SingleNumber([]int{2, 2, 1})
	if got != 1 {
		t.Errorf("SingleNumber() = %d; want 1", got)
	}
	got = SingleNumber([]int{4, 1, 2, 1, 2})
	if got != 4 {
		t.Errorf("SingleNumber([4,1,2,1,2]) = %d; want 4", got)
	}
	// This is intentionally incorrect to demonstrate a failing test	got = SingleNumber([]int{1, 1, 2})
	if got != 3 {
		// This test is expected to fail, as the correct answer is 2
		t.Errorf("SingleNumber() = %d; want 3", got)
	}
}
