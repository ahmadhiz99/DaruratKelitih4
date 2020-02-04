package com.example.daruratkelitih;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class TwoFragment extends Fragment {
    Button panggil;
    TextView one;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two,
                container, false);

        panggil = rootView.findViewById(R.id.btn_panggil);
        panggil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("message");
                myRef.setValue("Hello, World!");

//                DatabaseReference myRef = mFirebaseInstance.getReference("Kasus");

//                FirebaseUser currentUser = auth.getCurrentUser();
//                String uid = currentUser.getUid();
//                startActivity(new Intent(SignupActivity.this, LoginActivity.class));
//                mFirebaseInstance = FirebaseDatabase.getInstance();
                //get reference user
//                mFirebaseDatabase = mFirebaseInstance.getReference();
//                String input =  username.getText().toString();

//                mFirebaseDatabase.child("Kejadian").child("Saksi1").setValue(0);
//                mFirebaseDatabase.child("User").child(uid).child("email").setValue(email);
//                mFirebaseDatabase.child("User").child(uid).child("password").setValue(password);
//                mFirebaseDatabase.child("User").child(uid).child("saldo").setValue(0);
//                mFirebaseDatabase.child("User").child(uid).child("jenis_kelammin").setValue(0);
//                mFirebaseDatabase.child("User").child(uid).child("tgl_lahir").setValue(0););



                //pass
                Intent i = new Intent(getContext(), MapsActivity.class);
                startActivity(i);

            }
        });


        return rootView;

    }

}