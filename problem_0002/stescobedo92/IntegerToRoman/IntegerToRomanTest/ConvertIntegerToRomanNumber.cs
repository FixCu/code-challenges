using IntegerToRoman;

namespace IntegerToRomanTest;

public class ConvertIntegerToRomanNumber
{
    [Fact]
    public void TestConvertIntegerValueToRomanNumber()
    {
        int number1989 = 1989;
        var expectedResultFor1989 = ConvertToRomanNumber.IntToRoman(number1989);

        Assert.Equal("MCMLXXXIX", expectedResultFor1989);

        int number3 = 3;
        var expectedResultFor3 = ConvertToRomanNumber.IntToRoman(number3);

        Assert.Equal("III", expectedResultFor3);

        int number3999 = 3999;
        var expectedResultFor3999 = ConvertToRomanNumber.IntToRoman(number3999);

        Assert.Equal("MMMCMXCIX", expectedResultFor3999);
    }
}