package kazinazrul.csedu24.badhon_knih;

public class FindOthers {

    public String profileimage,fullname,status;

    public FindOthers(){

    }

    public FindOthers(String profileimage, String fullname, String status) {
        this.profileimage = profileimage;
        this.fullname = fullname;
        this.status = status;
    }

    public void setProfileimage(String profileimage) {
        this.profileimage = profileimage;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfileimage() {
        return profileimage;
    }

    public String getFullname() {
        return fullname;
    }

    public String getStatus() {
        return status;
    }
}
