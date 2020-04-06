/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */

 public class AnalysisHelper {
    // find user with Most Likes
    // TODO
     Map<Integer, Integer> userCount = new HashMap<>();
    public void getCount() {
       Map<Integer, Post> posts = DataStore.getInstance().getPosts();
       Map<Integer, User> users = DataStore.getInstance().getUsers();
       Map<Integer, Comment> comments = DataStore.getInstance().getComments();
       int sum = 0;
       for (User user : users.values()) {
           sum = 0;
           int postCount = 0;
           for (Post p : posts.values()) {
               if (p.getUserId() == user.getId()) {
                   postCount++;
               }
           }
           int commentCount = 0;
           int likesCount = 0;
           for (Comment c : comments.values()) {
               if (c.getUserId() == user.getId()) {
                   likesCount += c.getLikes();
                   commentCount++;
               }
           }
           sum = postCount + likesCount + commentCount;
           userCount.put(user.getId(), sum);
       }
   }

    public void userWithMostLikes(){
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        
        for(User user : users.values()){
            for(Comment c : user.getComments()){
                int likes = 0;
                if(userLikesCount.containsKey(user.getId())){
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for(int id : userLikesCount.keySet()){
            if(userLikesCount.get(id) > max){
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes:" + max + "\n" + users.get(maxId));
    }
  
    
    public void getAvgLikesPerComment(){
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        int comment = commentList.size();
        int likes = 0;
        for(Comment c: commentList){
            likes += c.getLikes();
        }
        System.out.println("1. Average Likes Per Comment: " + likes/comment);
    }
     public void getFiveMostLikedComment(){
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>(){
            @Override
            public int compare(Comment o1, Comment o2){
                return o2.getLikes()-o1.getLikes();
            }
        });
        System.out.println("5 most likes comments ");
        for(int i = 0; i < commentList.size() && i < 5; i++){
            System.out.println(commentList.get(i));
        }
    }
     
    
    public void postWithMostLikedComments(){
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Integer> likeCountofPosts = new HashMap<>();
        for(Post post : posts.values()){
            for(Comment cmnt : post.getComments()){
                int likes = 0;
                if(likeCountofPosts.containsKey(post.getPostId())){
                    likes = likeCountofPosts.get(post.getPostId());
                }
                likes += cmnt.getLikes();
                likeCountofPosts.put(post.getPostId(), likes);
            }
        }
        
        int max = 0;
         int maxid = 0;
         for(int ID : likeCountofPosts.keySet()){
             if(likeCountofPosts.get(ID) > max){
                 max = likeCountofPosts.get(ID);
                 maxid = ID;
             }
         } 
         System.out.println("2.1 Post with Most Liked Comments is " + posts.get(maxid)); 
         System.out.println("2.2 Count of Likes is " + max + "\n"); 
        
    }
    

     
     public void postWithMostComments(){
         Map<Integer,Post> posts = DataStore.getInstance().getPosts();
         Map<Integer,Integer> cntComment = new HashMap<>();
         for(Post p : posts.values()){
             for(Comment cmnt : p.getComments()){
                 int comments = 0;
                 if(cntComment.containsKey(p.getPostId())){
                     comments = cntComment.get(p.getPostId());
                     
                 }
                 comments += 1;
                 cntComment.put(p.getPostId(), comments);
             }
         }
         int max = 0;
         int maxid = 0;
         for(int ID : cntComment.keySet()){
             if(cntComment.get(ID) > max){
                 max = cntComment.get(ID);
                 maxid = ID;
             }
         } 
         System.out.println("3. The Post with Most Comments is " + posts.get(maxid));
     }
     

     public void topFiveInactiveByPost() {
       Map<Integer, Post> posts = DataStore.getInstance().getPosts();
       Map<Integer, User> users = DataStore.getInstance().getUsers();
       Map<Integer, Integer> userIdPostNo = new TreeMap<>();
       for (Post p : posts.values()) {
           userIdPostNo.put(p.getUserId(), userIdPostNo.containsKey(p.getUserId()) ? userIdPostNo.get(p.getUserId()) + 1 : 1);
       }
       ArrayList<Integer> commentList = new ArrayList<>(userIdPostNo.values());
       Collections.sort(commentList);
       ArrayList<Integer> finalUserIdList = new ArrayList<>();
       System.out.print("");
       //System.out.println("=======================================================================================================");
       System.out.println("\n 4. The Users and their post count is: " + userIdPostNo);
       int j = 0;
       for (int i = 0; i < 5; i++) {
           for (Entry<Integer, Integer> entry : userIdPostNo.entrySet()) {
               if (entry.getValue().equals(commentList.get(i)) && !finalUserIdList.contains(entry.getKey())) {
                   for (User u : users.values()) {
                       if (u.getId() == entry.getKey() && j < 5) {
                           System.out.println("Sum of the post is: "+commentList.get(i));
                            System.out.println(u);
                           finalUserIdList.add(u.getId());
                           j++;
                       }
                   }
               }
           }
       }
      /* for (int i = 0; i < 5; i++) {
           System.out.println("\n" +finalUserIdList);
       }*/
       commentList.clear();
   }
     
    public void topFiveInactiveUsersByComment() {
       ArrayList<Integer> finalUserIdList = new ArrayList<>();
       Map<Integer, User> users = DataStore.getInstance().getUsers();
       getCount();
       ArrayList<Integer> commentCount = new ArrayList<>(userCount.values());
       Collections.sort(commentCount);
       List<Integer> sortedList = new ArrayList<>(userCount.values());
       Collections.sort(sortedList, new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1 - o2;
           }
       });
       System.out.println("\n 5. The Users and their comment count is: " + userCount);
       int j = 0;
       for (int i = 0;  i < 5; i++) {
           for (Entry<Integer, Integer> entry : userCount.entrySet()) {
               if (entry.getValue().equals(commentCount.get(i)) && !finalUserIdList.contains(entry.getKey())) {
                   for (User u : users.values()) {
                       if (u.getId() == entry.getKey() && j<5) {
                           System.out.println(u);
                           finalUserIdList.add(u.getId());
                           j++;
                       }
                   }
               }
           }
           sortedList.clear();
       }
   }

   public void topFiveInactiveUsersOverall() {
       Map<Integer, User> users = DataStore.getInstance().getUsers();
       getCount();
       List<Integer> sortedList = new ArrayList<>(userCount.values());
       List<Integer> userIdList = new ArrayList<>();
       Collections.sort(sortedList, new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1 - o2;
           }
       });       
       System.out.println("\n6. The Top 5 Inactive Users are: ");
       System.out.println("\n Users and their overall count is as follows: " + userCount +"\n");
       for (int i = 0; i < sortedList.size() && i < 5; i++) {
           for (Entry<Integer, Integer> entry : userCount.entrySet()) {
               if (entry.getValue().equals(sortedList.get(i)) && !userIdList.contains(entry.getKey())) {
                   for (User user : users.values()) {
                       if (user.getId() == entry.getKey()) {
                           System.out.println(users.get(user.getId()));
                           userIdList.add(user.getId());
                       }
                   }
               }
           }
           System.out.println("The Sum of overall posts, comments & likes: " + sortedList.get(i) + "\n");
       }
       sortedList.clear();
   }
    public void topFiveProactiveUsersOverall() {
       Map<Integer, User> users = DataStore.getInstance().getUsers();
       List<Integer> userIdList = new ArrayList<>();
       getCount();
       List<Integer> sortedList = new ArrayList<>(userCount.values());
       Collections.sort(sortedList, new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1 - o2;
           }
       });
      
       System.out.println("\n7.The Top Five Proactive Users are:");
       System.out.println("\nThe Users and their overall count is: " + userCount+"\n");
       for (int i = sortedList.size() - 1; i > 4; i--) {
           for (Entry<Integer, Integer> entry : userCount.entrySet()) {
               if (entry.getValue().equals(sortedList.get(i)) && !userIdList.contains(entry.getKey())) {
                   for (User user : users.values()) {
                       if (user.getId() == entry.getKey()) {
                           System.out.println(users.get(user.getId()));
                           userIdList.add(user.getId());
                       }
                   }
               }
           }
           System.out.println("The Sum of overall posts, comments & likes: " + sortedList.get(i) + "\n");
       }
       sortedList.clear();
   }

}

