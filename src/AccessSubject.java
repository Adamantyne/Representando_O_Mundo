public class AccessSubject {
    private Subject subject;
    private User user;

    AccessSubject(User user, Subject subject) {
        this.user = user;
        this.subject = subject;
    }

    public String access() {
        if (user.getStatus()) {
            user.setExp();
            subject.setViews();
            return buildingPage();
        } else
            return "you must be logged in to access this page";
    }

    private String buildingPage() {
        String text = user.getEmail() + "\n" + user.getUsername() + "\n"+"\n" + subject.getTittle()+"\n"+"\n";

        String[] subtittles = subject.getSubtittle();
        String[] contents = subject.getContent();

        for(int i = 0; i<subtittles.length; i++){
            text += subtittles[i] + "\n";
            text += contents[i] + "\n"+"\n";
        }

        return text;
    }
}
