package deep.testmaterial.card;

import java.util.ArrayList;

import android.content.Context;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import deep.testmaterial.R;
import deep.testmaterial.util.IcardViewChanger;

/**
 * Created by wangfei on 17/4/15.
 */

public class CardListAdapter  extends RecyclerView.Adapter<CardListAdapter.MyViewHolder>{
private Context context;
private ArrayList<String> list ;
    private IcardViewChanger icardViewChanger;
public CardListAdapter(Context context,ArrayList<String> list){
    this.context = context;
    this.list = list;
    }
@Override
public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
    context).inflate(R.layout.item_cardview, parent,
    false));
    Log.e("xxxxxx" ,"onCreateViewHolder");
    return holder;
    }

@Override
public void onBindViewHolder(MyViewHolder holder, int position) {
    holder.tv.setText(list.get(position));
    if (icardViewChanger!=null){
        icardViewChanger.changeCardView(holder.cardView);
    }
    Log.e("xxxxxx" ,"onBindViewHolder");
    }

    public void setIcardViewChanger(IcardViewChanger icardViewChanger) {
        this.icardViewChanger = icardViewChanger;
    }

    @Override
public int getItemCount() {
    return list.size();
    }
class MyViewHolder extends RecyclerView.ViewHolder
{

    TextView tv;
    CardView cardView;
    public MyViewHolder(View view)
    {
        super(view);
        tv = (TextView) view.findViewById(R.id.text);
        cardView = (CardView) view.findViewById(R.id.cardView);
        cardView.setRadius(8);//设置图片圆角的半径大小
        cardView.setCardElevation(8);//设置阴影部分大小
        cardView.setContentPadding(5,5,5,5);
    }
}
}