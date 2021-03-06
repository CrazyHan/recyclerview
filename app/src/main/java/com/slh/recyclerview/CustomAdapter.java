package com.slh.recyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget1.RecyclerView;

import java.util.List;
import java.util.Map;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private Context context;
    private List<String> list;

    private static final String TAG = "CustomAdapter";

    public CustomAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
//        Map<Thread,StackTraceElement[]> elementsMap = Thread.getAllStackTraces();
//        StackTraceElement[] stackTrace = elementsMap.get(Thread.currentThread());
//
//        for (StackTraceElement stackTraceElement : stackTrace) {
//            Log.e("onCreateViewHolder",  stackTraceElement.getLineNumber()+ " "+ stackTraceElement.getMethodName()+ " >>>>"+ stackTraceElement.getClassName());
//        }

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.tv.setText(list.get(position));

        Log.e(TAG, "onBindViewHolder: " + position);

//        Map<Thread,StackTraceElement[]> elementsMap = Thread.getAllStackTraces();
//        StackTraceElement[] stackTrace = elementsMap.get(Thread.currentThread());
//
//        for (StackTraceElement stackTraceElement : stackTrace) {
//            Log.e("onBindViewHolder",  stackTraceElement.getLineNumber()+ " "+ stackTraceElement.getMethodName()+ " >>>>"+ stackTraceElement.getClassName());
//        }
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private TextView tv;

        public CustomViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
        }

        @Override
        public String toString() {
            return super.toString()+"{" +
                    "tv=" + tv.getText() +
                    '}';
        }
    }

}
