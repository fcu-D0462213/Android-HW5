package com.example.hw5;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 路人 on 2017/5/14.
 */

public class AlbumAdapter extends ArrayAdapter<AlbumPut> {
    private Context context;

    public AlbumAdapter(Context context, List objects) {
        super(context,0,objects);
        this.context = context;
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater=LayoutInflater.from(context);
        LinearLayout itemlayout=null;
        if(convertView==null)
        {
            itemlayout=(LinearLayout)inflater.inflate(R.layout.listitem,null);
        }else{
            itemlayout=(LinearLayout)convertView;
        }
        AlbumPut item=(AlbumPut)getItem(position);

        ImageView host=(ImageView)itemlayout.findViewById(R.id.img_host);
        host.setImageResource(item.getHostTeam());
        TextView hostName=(TextView)itemlayout.findViewById(R.id.host_name);
        hostName.setText(item.getHostName());
        TextView hostScore=(TextView)itemlayout.findViewById(R.id.host_score);
        hostScore.setText(item.getHostScore());

        ImageView guest=(ImageView)itemlayout.findViewById(R.id.img_guest);
        guest.setImageResource(item.getGuestTeam());
        TextView guestName=(TextView)itemlayout.findViewById(R.id.guest_name);
        guestName.setText(item.getGuestName());
        TextView guestScore=(TextView)itemlayout.findViewById(R.id.guest_score);
        guestScore.setText(item.getGuestScore());

        int hsScore=Integer.parseInt(item.getHostScore());
        int gsScore=Integer.parseInt(item.getGuestScore());
        if(hsScore>gsScore)
        {
            hostScore.setTextColor(Color.RED);
        }else {
            guestScore.setTextColor(Color.RED);
        }
        return itemlayout;
    }
}
