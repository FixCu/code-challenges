namespace IntegerToRoman;

/// <summary>
/// This class is use for convert an integer (should be in the range of 1 to 3999) number in the equivalent roman representation
/// </summary>
public class ConvertToRomanNumber
{
    /// <summary>
    /// Converts an integer to its Roman numeral representation.
    /// </summary>
    /// <param name="num">The integer to convert (should be in the range of 1 to 3999).</param>
    /// <returns>The Roman numeral equivalent of the input integer.</returns>
    /// <exception cref="ArgumentOutOfRangeException">Thrown if the input number is less than or equal to 0 or greater than 3999.</exception>
    public static string IntToRoman(int num)
    {
        if (num <= 0 || num > 3999)
            throw new ArgumentOutOfRangeException("The number should be in the range of 1 to 3999");

        var romanNumbers = FillWithRomanNumbers();
        string integerToRoman = "";

        // Iterate over Roman values
        foreach (var (integerNumber, romanNumberEquivalent) in romanNumbers)
        {
            // While the number is greater than or equal to the current decimal value
            while (num >= integerNumber)
            {
                // Subtract the decimal value from the number and add the Roman numeral to the result
                num -= integerNumber;
                integerToRoman += romanNumberEquivalent;
            }
        }

        return integerToRoman;
    }

    /// <summary>
    /// Fills a list with Roman numeral representations of integer values.
    /// </summary>
    /// <returns>A list of tuples containing integer values and their corresponding Roman numerals.</returns>
    private static List<(int, string)> FillWithRomanNumbers()
    {
        return new List<(int, string)>
        {
            (1000, "M"),   // Represents 1000 as "M"
            (900, "CM"),   // Represents 900 as "CM"
            (500, "D"),    // Represents 500 as "D"
            (400, "CD"),   // Represents 400 as "CD"
            (100, "C"),    // Represents 100 as "C"
            (90, "XC"),    // Represents 90 as "XC"
            (50, "L"),     // Represents 50 as "L"
            (40, "XL"),    // Represents 40 as "XL"
            (10, "X"),     // Represents 10 as "X"
            (9, "IX"),     // Represents 9 as "IX"
            (5, "V"),      // Represents 5 as "V"
            (4, "IV"),     // Represents 4 as "IV"
            (1, "I")       // Represents 1 as "I"
        };
    }
}
