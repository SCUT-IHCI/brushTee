package com.cillivian.brushtee.model;

import android.provider.ContactsContract;
import android.widget.ImageView;

import com.cillivian.brushtee.R;
import com.cillivian.brushtee.model.Card;

public class InitData {
   private   Card card;
   private int[] images;
   private ImageView imageView;
   int num;
   int index;
   private ImageView initData(){
  card.setImages(new int[]{R.drawable.star4,R.drawable.star5});
//        images=new int[]{R.drawable.star4,R.drawable.star5,};
//        imageView.setImageResource(images[0]);
    images= card.getImages();
        imageView.setImageResource(images[0]);
    num =images.length;
    index = 0;
   return imageView;
   }
}
