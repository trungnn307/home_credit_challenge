package com.homecredit.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

// [START post_class]
@IgnoreExtraProperties
public class Follower {

    public String uid;
    public String token;

    public Follower() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Follower(String uid, String token) {
        this.uid = uid;
        this.token = token;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("token", token);

        return result;
    }

}
