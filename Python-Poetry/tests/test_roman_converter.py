import unittest
from roman_converter.roman_converter import roman_to_int

class TestRomanConverter(unittest.TestCase):
    def test_roman_to_int(self):
        # Test cases for valid Roman numerals
        self.assertEqual(roman_to_int('III'), 3)
        self.assertEqual(roman_to_int('IV'), 4)
        self.assertEqual(roman_to_int('IX'), 9)
        self.assertEqual(roman_to_int('LVIII'), 58)
        self.assertEqual(roman_to_int('MCMXCIV'), 1994)

        # Test cases for edge cases
        self.assertEqual(roman_to_int('I'), 1)
        self.assertEqual(roman_to_int('XII'), 12)
        self.assertEqual(roman_to_int('XL'), 40)
        self.assertEqual(roman_to_int('XC'), 90)
        self.assertEqual(roman_to_int('CD'), 400)
        self.assertEqual(roman_to_int('CM'), 900)