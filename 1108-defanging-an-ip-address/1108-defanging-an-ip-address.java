class Solution {
    public String defangIPaddr(String address) {
        return solve(address, 0);
    }

    public String solve(String address, int i) {
        if (i == address.length()) {
            return "";
        }

        if (address.charAt(i) == '.') {
            return "[.]" + solve(address, i + 1);
        }

        return address.charAt(i) + solve(address, i + 1);
    }
}