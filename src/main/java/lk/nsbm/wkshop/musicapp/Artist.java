package lk.nsbm.wkshop.musicapp;

public class Artist {

    private String firstName;
    private String lastName;
    private String gender;
    private String profilePicture;

    public Artist() {
    }

    public Artist(String firstName, String lastName, String gender, String profilePicture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.profilePicture = profilePicture;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}
