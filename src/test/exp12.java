//package test;
//
//
////import static org.junit.Assert.assertEquals;
////import org.junit.jupiter.api.Test;
////import static org.junit.Assert.*;
////import org.junit.Test;
//import java.util.ArrayList;
//import java.util.List;
//
//public class exp12 {
//
//    private String username;
//    private List<String> complaints;
//
//    public exp12() {
////        this.username = username;
//        this.username = "Anvita";
//        this.complaints = new ArrayList<>();
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public int getComplaintCount() {
//        return complaints.size();
//    }
//
//    public boolean postComplaint(String content) {
//        complaints.add(content);
//        return true; // Indicate successful posting
//    }
//
//    public String getComplaint(int index) {
//        if (index >= 0 && index < complaints.size()) {
//            return complaints.get(index);
//        }
//        return null;
//    }
//
//    @Test
//    public void testPostComplaint() {
//        // Given a user with an account
//        exp12 user = new exp12();
//
//        // When the user posts a complaint
//        String complaintContent = "This is a test complaint.";
//        boolean postResult = user.postComplaint(complaintContent);
//
//        // Then the complaint should be successfully posted
//        assertTrue(postResult);
//
//        // And the user's complaint count should increase by 1
//        assertEquals(1, user.getComplaintCount());
//
//        // And the complaint should be in the user's complaint list
//        String postedComplaint = user.getComplaint(0);
//        assertNotNull(postedComplaint);
//        assertEquals(complaintContent, postedComplaint);
//    }
//}
