package com.meizu.mzroottools;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class UnLockDevFragment extends Fragment implements View.OnClickListener {

    private View view;
    private ImageView unlock_img;
    private TextView unlock_msg_mark, unlock_msg_prompt;
    private LinearLayout unlock_msg;
    private Button button;

    private static final String TAG = "解锁设备";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.unlock_device, null);

        init();
        return view;
    }

    private void init() {
        unlock_img = view.findViewById(R.id.unlock_img);
        unlock_msg_mark = view.findViewById(R.id.unlock_msg_mark);
        unlock_msg_prompt = view.findViewById(R.id.unlock_msg_prompt);
        unlock_msg = view.findViewById(R.id.unlock_success);
        button = view.findViewById(R.id.unlock_button);
        button.setOnClickListener(this);

        hintView(false);
    }

    private void hintView(boolean isFailed){
        if (!isFailed) {
            //没有获取已经获取了权限
            Log.d(TAG, String.valueOf(isFailed));
            unlock_img.setImageResource(R.mipmap.ic_launcher_round);
            unlock_msg_mark.setText("解锁成功");
            unlock_msg_prompt.setText("已成功获取本机的Root权限");

            unlock_msg.setVisibility(View.VISIBLE);
            button.setVisibility(View.GONE);
        }else {
            //没有获取
            Log.d(TAG, String.valueOf(isFailed));
            unlock_img.setImageResource(R.mipmap.ic_launcher_round);

            unlock_msg.setVisibility(View.GONE);
            button.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.unlock_button:
                //进行解锁操作(network..)
                Toast.makeText(getContext(),"解锁设备",Toast.LENGTH_SHORT).show();
//                OkHttpClient okHttpClient = new OkHttpClient();
//                Request request = new Request.Builder().url("https://suggest.taobao.com/sug?code=utf-8&q=%E5%8D%AB%E8%A1%A3&callback=cb").build();
//                okHttpClient.newCall(request).enqueue(new Callback() {
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//                        Log.d("onResponse: ", response.body().string());
//                    }
//                });
                break;
            default:
                break;
        }
    }
}
