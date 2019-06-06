package com.homecredit.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MySubscribedPostsFragment extends PostListFragment {

    public MySubscribedPostsFragment() {
    }


    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        String myUserId = getUid();
        Query myTopPostsQuery = databaseReference.child("stars").child(myUserId);

        return myTopPostsQuery;
    }
}
