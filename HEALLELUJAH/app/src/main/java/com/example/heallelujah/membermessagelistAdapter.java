package com.example.heallelujah;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class membermessagelistAdapter extends BaseAdapter{ // adapter는 ListView와 실제데이터 사이의 중간역할. 
                                                            // adapter가 ListView에 실제데이터를 주어 목록으로 보이게함.
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;//inflater는 xml로 정의된 view를 실체화시킴.
    ArrayList<memberlist> memberlist;

    public membermessagelistAdapter(Context context, ArrayList<memberlist> members) {
        mContext = context;
        memberlist = members;
        mLayoutInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return memberlist.size();
    }

    @Override
    public memberlist getItem(int position) {
        return memberlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.messageitem,null);
        TextView mname = (TextView) view.findViewById(R.id.Human_name3);
        TextView msa = (TextView) view.findViewById(R.id.textView43);
        ImageView memberinfocheck = (ImageView) view.findViewById(R.id.imageView3);

        mname.setText(memberlist.get(position).getmembername()+ "/회원");
        msa.setText(memberlist.get(position).getmemberage()+"/"+memberlist.get(position).getmembersex());
        return view;
    }
}
