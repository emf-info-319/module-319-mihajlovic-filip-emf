public class devour4 {
    public final static int MAX_DAYS = 31;
    public final static int MAX_MONTH = 12;
    public final static int MAX_YEARS = 9999;
    public static void main(String[] args) {
        int year = 2024;
        int month = 10;
        int day = 3;
        int maxDays = MAX_DAYS;
        String[] months = new String[]{"janvier","février","mars","avril","mai","juin","juillet","août","septembre","octobre","noembre","décembre"};
        System.out.println("date entrée est le " + day + "." + month + "." + year);
        if (month == 2) {
            if (year % 4 == 0) {
                maxDays = 29;
            }
            else{
                maxDays = 28;
            }
        }
        if (year>MAX_YEARS || year<0) {
            System.out.println("L'année [" + year + "] est hors limites");
        }
        else if (day>maxDays || day<0) {
            System.out.println("Le jour [" + day + "] est hors limites");
        } 
        else if (month>MAX_MONTH || month<0) {
            System.out.println("Le mois [" + month + "] est hors limites");
        }
        else{
            System.out.println("La date formatée est le " + day + " " + months[--month] + " " + year);
        }
    }
}
