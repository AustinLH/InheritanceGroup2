
/**
 * The Infant Class
 * @author Leona Henion <LHenion@mail.dccc.edu>
 */
public class Infant extends Person {

    /**
     * The infant's favorite source of entertainment.
     */
    private String favoriteEntertainment;

    /**
     * The infant's favorite physical activity.
     */
    private String favoriteActivity;

    public Infant(String theName, int theAge, double theWeight, char theGender) {
        super(theName, theAge, theWeight, theGender);
    }

    /**
     * Constructor for objects of class Infant
     */
    public Infant(String theName, int theAge, double theWeight, char theGender, String entertainment, String activity) {
        super(theName, theAge, theWeight, theGender);
        this.setAge(theAge);
        favoriteEntertainment = entertainment;
        favoriteActivity = activity;
    }

    @Override
    /**
     * The setAge method.
     *
     * @param newAge The new age.
     */
    public void setAge(int newAge) {
        if (newAge > 2 && newAge <= 0) {
            System.out.println("An infant cannot be this age! Infants age range from 1 month to 2 years of age.");
        } else {
            super.setAge(newAge);
        }
    }

    /**
     * The getSchool method.
     *
     * @return The kind of school the infant is currently enrolled at, Day-care,
     * pre-school, elementary, etc.
     */
    public String getSchool() {
        int age = this.getAge();
        String schoolString = null;
        if (age < 1) {
            schoolString = "This infant is too young to be enrolled at any type of institution.";
        } else if (age == 1 || age == 2) {
            schoolString = "This infant is currently enrolled in a Daycare program.";
        }
        return schoolString;
    }

    /**
     * The getFavActivity method.
     *
     * @return The infant's favorite activity.
     */
    public String getFavActivity() {
        return favoriteActivity;
    }

    /**
     * The getFavEntertainment method.
     *
     * @return The infant's favorite source of entertainment.
     */
    public String getFavEntertainment() {
        return favoriteEntertainment;
    }

    /**
     * The setFavActivity method.
     *
     * @partam newActivity The infant's new favorite activity.
     */
    public void setFavActivity(String newFavActivity) {
        favoriteActivity = newFavActivity;
    }

    /**
     * The setFavEntertainment method.
     *
     * @partam newActivity The infant's new favorite source of entertainment.
     */
    public void setFavEntertainment(String newFavEntertainment) {
        favoriteEntertainment = newFavEntertainment;
    }
}
