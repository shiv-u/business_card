package com.androidexample.business_card;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView contact_pic,mail_pic,maps_pic,review_pic,main_pic;
    TextView contact_text,mail_text,maps_text,review_text,main_text;
    CardView contacts,mail,maps,reviews;
    int count_contacts=0;
    int count_mail=0;
    int count_maps=0;
    int count_reviews=0;
    int count_main=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_pic=findViewById(R.id.imageView);
        contact_pic=findViewById(R.id.contact_pic);
        mail_pic=findViewById(R.id.mail_pic);
        maps_pic=findViewById(R.id.map_pic);
        review_pic=findViewById(R.id.review_pic);

        main_text=findViewById(R.id.textView);
        contact_text=findViewById(R.id.contact_text);
        mail_text=findViewById(R.id.mail_text);
        maps_text=findViewById(R.id.map_text);
        review_text=findViewById(R.id.review_text);


        contacts=findViewById(R.id.cardView2);
        mail=findViewById(R.id.cardView);
        maps=findViewById(R.id.cardView3);
        reviews=findViewById(R.id.cardView4);

        main_pic.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                count_main+=1;
                if (count_main % 2 != 0) {
                    main_pic.setImageResource(R.drawable.logo);
                    main_text.setVisibility(View.INVISIBLE);


                    return true;
                }
                else
                {
                   main_pic.setImageResource(R.drawable.palace);
                   main_text.setVisibility(View.VISIBLE);
                    return  true;
                }

            }
        });

        contacts.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v) {
                count_contacts += 1;
                if (count_contacts % 2 != 0) {
                    contact_pic.setVisibility(View.INVISIBLE);
                    contact_text.setVisibility(View.VISIBLE);
                    contact_text.setText(R.string.Contact_Us);

                    return true;
                }
                else
                {
                    contact_text.setVisibility(View.INVISIBLE);
                    contact_pic.setVisibility(View.VISIBLE);
                    contact_pic.setImageResource(R.drawable.phone);
                    return  true;
                }
            }

        });
        mail.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                count_mail+=1;
                if (count_mail % 2 != 0) {
                    mail_pic.setVisibility(View.INVISIBLE);
                    mail_text.setVisibility(View.VISIBLE);
                    mail_text.setText(R.string.Mail_Us);

                    return true;
                }
                else
                {
                    mail_text.setVisibility(View.INVISIBLE);
                    mail_pic.setVisibility(View.VISIBLE);
                    mail_pic.setImageResource(R.drawable.mail);
                    return  true;
                }

            }
        });
        maps.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                count_maps+=1;
                if (count_maps % 2 != 0) {
                    maps_pic.setVisibility(View.INVISIBLE);
                    maps_text.setVisibility(View.VISIBLE);
                    maps_text.setText(R.string.Find_Us);

                    return true;
                }
                else
                {
                    maps_text.setVisibility(View.INVISIBLE);
                    maps_pic.setVisibility(View.VISIBLE);
                    maps_pic.setImageResource(R.drawable.maps);
                    return  true;
                }

            }
        });
        reviews.setOnLongClickListener(new View.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                count_reviews+=1;
                if (count_reviews % 2 != 0) {
                    review_pic.setVisibility(View.INVISIBLE);
                    review_text.setVisibility(View.VISIBLE);
                    review_text.setText(R.string.Reviews);

                    return true;
                }
                else
                {
                    review_text.setVisibility(View.INVISIBLE);
                    review_pic.setVisibility(View.VISIBLE);
                    review_pic.setImageResource(R.drawable.review);
                    return  true;
                }
            }
        });
    }
    public void about_us(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.karnatakatourism.org/"));
        startActivity(intent);
    }
    public void contact_us(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:091088 81735"));
        startActivity(intent);
    }
    public void map(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Karnataka+Tourism/@12.961058,77.5359453,12z/data=!4m8!1m2!2m1!1skarnataka+tourism+bengaluru!3m4!1s0x3bae142eda7244c7:0x518c22c00bc44997!8m2!3d12.9618294!4d77.6159663"));
        startActivity(intent);
    }
   public void mail(View view)
   {
       Intent intent= new Intent(Intent.ACTION_SENDTO);
       intent.setType("*/*");
       intent.setData(Uri.parse("mailto:info@kstdc.co"));
       startActivity(intent);
   }
   public void reviews(View view)
   {
       Intent intent=new Intent(Intent.ACTION_VIEW);
       intent.setData(Uri.parse("https://www.tripadvisor.in/ShowUserReviews-g297628-d2144287-r266992896-Karnataka_State_Tourism_Development_Day_Tours-Bengaluru_Bangalore_District_Karna.html"));
       startActivity(intent);
   }



}
