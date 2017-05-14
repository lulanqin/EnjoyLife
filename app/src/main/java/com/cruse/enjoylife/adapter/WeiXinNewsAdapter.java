package com.cruse.enjoylife.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.cruse.enjoylife.R;
import com.cruse.enjoylife.activity.NewDetailActivity;
import com.cruse.enjoylife.bean.SocalNewsBean;
import com.cruse.enjoylife.bean.WXNewsBean;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lulanqin on 2017/5/12.
 */
public class WeiXinNewsAdapter extends RecyclerView.Adapter<WeiXinNewsAdapter.ViewHolder> {

    private Context mContext;
    private List<WXNewsBean.NewslistBean> dataList = new LinkedList<>();

    public void addAllData(WXNewsBean bean) {
        this.dataList.addAll(bean.getNewslist());
        notifyDataSetChanged();
    }

    public void clearData() {
        this.dataList.clear();
        notifyDataSetChanged();
    }

    public WeiXinNewsAdapter(Context context) {
        mContext = context;
        //this.dataList.addAll(bean.getNewslist());
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        private ImageView iv;
        private TextView  from;
        private TextView  time;
        private RelativeLayout rl;

        public ViewHolder(View itemView) {
            super(itemView);
            rl = (RelativeLayout) itemView.findViewById(R.id.rl_News);
            name = (TextView) itemView.findViewById(R.id.tv_News_name);
            from = (TextView) itemView.findViewById(R.id.tv_News_from);
            time = (TextView) itemView.findViewById(R.id.tv_News_time);
            iv = (ImageView) itemView.findViewById(R.id.iv_News_img);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(WeiXinNewsAdapter.ViewHolder holder, final int position) {
        holder.name.setText(dataList.get(position).getTitle());
        holder.from.setText(dataList.get(position).getDescription());
        holder.time.setText(dataList.get(position).getCtime());

        Glide.with(mContext).load(dataList.get(position).getPicUrl())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.iv);



        holder.rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, NewDetailActivity.class);
                intent.putExtra("url",dataList.get(position).getUrl()+"");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
