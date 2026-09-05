class Solution {

    String[] below20 = {
        "", "One", "Two", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
        "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    String helper(int num) {
        String result = "";

        if (num >= 100) {
            result += below20[num / 100] + " Hundred";
            num %= 100;
            if (num != 0) result += " ";
        }

        if (num >= 20) {
            result += tens[num / 10];
            num %= 10;
            if (num != 0) result += " ";
        }

        if (num > 0) {
            result += below20[num];
        }

        return result;
    }

    public String numberToWords(int num) {

        if (num == 0)
            return "Zero";

        String result = "";

        if (num >= 1000000000) {
            result += helper(num / 1000000000) + " Billion";
            num %= 1000000000;
            if (num != 0) result += " ";
        }

        if (num >= 1000000) {
            result += helper(num / 1000000) + " Million";
            num %= 1000000;
            if (num != 0) result += " ";
        }

        if (num >= 1000) {
            result += helper(num / 1000) + " Thousand";
            num %= 1000;
            if (num != 0) result += " ";
        }

        if (num > 0) {
            result += helper(num);
        }

        return result;
    }
}