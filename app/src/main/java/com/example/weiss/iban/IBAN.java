package com.example.weiss.iban;

public class IBAN {

    public String getIBANbc(String countrycode, String bankcode, String accountnumber, int b, int c) {
        char[] arr = new char[b+c+6];
        char[] arr1 = bankcode.toCharArray();
        char[] arr2 = accountnumber.toCharArray();
        char[] countrycodearr = countrycode.toCharArray();
        int countrycode1;
        int countrycode2;
        String countrycodevalue;

        if (arr1.length != b) {
            return "Invalid bank code!";
        }

        if (arr2.length > c) {
            return "Invalid account number!";
        } else if (arr2.length == c - 1) {
            accountnumber = "0" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 2) {
            accountnumber = "00" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 3) {
            accountnumber = "000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 4) {
            accountnumber = "0000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 5) {
            accountnumber = "00000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 6) {
            accountnumber = "000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 7) {
            accountnumber = "0000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 8) {
            accountnumber = "00000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 9) {
            accountnumber = "000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 10) {
            accountnumber = "0000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 11) {
            accountnumber = "00000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 12) {
            accountnumber = "000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 13) {
            accountnumber = "0000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 14) {
            accountnumber = "00000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 15) {
            accountnumber = "000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 16) {
            accountnumber = "0000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 17) {
            accountnumber = "00000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 18) {
            accountnumber = "000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 19) {
            accountnumber = "0000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 20) {
            accountnumber = "00000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 21) {
            accountnumber = "000000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 22) {
            accountnumber = "0000000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length < c - 22) {
            return "Invalid account number!";
        }

        for (int i = 0; i < b; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < c; i++) {
            arr[i + b] = arr2[i];
        }
        countrycode1 = (int) countrycodearr[0] - 55;
        countrycode2 = (int) countrycodearr[1] - 55;
        countrycodevalue = Integer.toString(100 * countrycode1 + countrycode2);
        char[] arr3 = countrycodevalue.toCharArray();
        for (int i = 0; i < 4; i++) {
            arr[i + b + c] = arr3[i];
        }
        arr[b + c + 4] = '0';
        arr[b + c + 5] = '0';
        String number = new String(arr);
        String checkdigits = String.valueOf(getCheckDigits(number));
        char[] ba = new char[b + c];
        for (int i = 0; i < b + c; i++) {
            ba[i] = arr[i];
        }
        String stringba = new String(ba);
        return countrycode + checkdigits + stringba;
    }

    public String getIBANbsc(String countrycode, String bankcode, String branchcode, String accountnumber, int b, int s,int c) {
        char[] arr = new char[b+s+c+6];
        char[] arr1 = bankcode.toCharArray();
        char[] branchc = branchcode.toCharArray();
        char[] arr2 = accountnumber.toCharArray();
        char[] countrycodearr = countrycode.toCharArray();
        int countrycode1;
        int countrycode2;
        String countrycodevalue;

        if (arr1.length != b) {
            return "Invalid bank code!";
        }

        if (branchc.length != s) {
            return "Invalid bank code!";
        }

        if (arr2.length > c) {
            return "Invalid account number!";
        } else if (arr2.length == c - 1) {
            accountnumber = "0" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 2) {
            accountnumber = "00" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 3) {
            accountnumber = "000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 4) {
            accountnumber = "0000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 5) {
            accountnumber = "00000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 6) {
            accountnumber = "000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 7) {
            accountnumber = "0000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 8) {
            accountnumber = "00000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 9) {
            accountnumber = "000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 10) {
            accountnumber = "0000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 11) {
            accountnumber = "00000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 12) {
            accountnumber = "000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 13) {
            accountnumber = "0000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 14) {
            accountnumber = "00000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 15) {
            accountnumber = "000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 16) {
            accountnumber = "0000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 17) {
            accountnumber = "00000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 18) {
            accountnumber = "000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 19) {
            accountnumber = "0000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 20) {
            accountnumber = "00000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 21) {
            accountnumber = "000000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length == c - 22) {
            accountnumber = "0000000000000000000000" + accountnumber;
            arr2 = accountnumber.toCharArray();
        } else if (arr2.length < c - 22) {
            return "Invalid account number!";
        }

        for (int i = 0; i < b; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < s; i++) {
            arr[i + b] = branchc[i];
        }
        for (int i = 0; i < c; i++) {
            arr[i + b + s] = arr2[i];
        }
        countrycode1 = (int) countrycodearr[0] - 55;
        countrycode2 = (int) countrycodearr[1] - 55;
        countrycodevalue = Integer.toString(100 * countrycode1 + countrycode2);
        char[] arr3 = countrycodevalue.toCharArray();
        for (int i = 0; i < 4; i++) {
            arr[i + b + s + c] = arr3[i];
        }
        arr[b + s + c + 4] = '0';
        arr[b + s + c + 5] = '0';
        String number = new String(arr);
        char[] ba = new char[b + s + c];
        for (int i = 0; i < b + s + c; i++) {
            ba[i] = arr[i];
        }
        String stringba = new String(ba);
        return countrycode + getCheckDigits(number) + stringba;
    }

    private String getCheckDigits(String n) {
        char[] arr = n.toCharArray();
        char[] arr1 = new char[9];
        char[] arr2 = new char[7];
        char[] arr30 = new char[7];
        char[] arr31 = new char[arr.length - 16];
        int z;

        for (int j = 0; j < 9; j++)
        {
            arr1[j] = arr[j];
        }
        for (int j = 0; j < 7; j++)
        {
            arr2[j] = arr[j+9];
        }
        if (arr.length > 23) {
            for (int j = 0; j < 7; j++) {
                arr30[j] = arr[j + 16];
            }
        } else {
            for (int j = 0; j < arr.length - 16; j++) {
                arr31[j] = arr[j + 16];
            }
        }

        if (arr.length > 23) {
            char[] arr4 = new char[arr.length - 23];
            for (int j = 0; j < (arr.length - 23); j++)
            {
                arr4[j] = arr[j+23];
            }
            String str1 = new String(arr1);
            String str2 = new String(arr2);
            String str3 = new String(arr30);
            String str4 = new String(arr4);

            int a = Integer.parseInt(str1);
            int e = a % 97;
            int b = Integer.parseInt(e+str2);
            int f = b % 97;
            int c = Integer.parseInt(f+str3);
            int g = c % 97;
            int d = Integer.parseInt(g+str4);
            int h = d % 97;

            z = 98 - h;
        } else {
            String str1 = new String(arr1);
            String str2 = new String(arr2);
            String str3 = new String(arr31);

            int a = Integer.parseInt(str1);
            int e = a % 97;
            int b = Integer.parseInt(e+str2);
            int f = b % 97;
            int c = Integer.parseInt(f+str3);
            int g = c % 97;

            z = 98 - g;
        }

        if (z >= 10) {
            return String.valueOf(z);
        } else {
            return "0"+String.valueOf(z);
        }
    }
}