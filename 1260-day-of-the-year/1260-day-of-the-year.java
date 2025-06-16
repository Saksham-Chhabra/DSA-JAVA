class Solution {
    public int dayOfYear(String date) {
        int leapArray[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        int NonleapArray[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int y=Integer.parseInt(date.substring(0, 4));
        int m=Integer.parseInt(date.substring(5, 7));
        int res=Integer.parseInt(date.substring(8));

        boolean isDivsBy4 =  y%4 == 0;
        boolean isDivsBy100 = y%100 == 0;
        boolean isDivsBy400 = y%400 == 0;

        int NumberOfDays = 0;

    if ((isDivsBy100 && isDivsBy4 && isDivsBy400) || (isDivsBy4 && !isDivsBy100)) {
        for (int i=1; i <=m;i++) {
            NumberOfDays += leapArray[i-1];
        }
        NumberOfDays += res;
}
else {
for (int i=1; i <=m;i++) {
            NumberOfDays += NonleapArray[i-1];
        }
        NumberOfDays += res;
}   
return NumberOfDays;
    }
}