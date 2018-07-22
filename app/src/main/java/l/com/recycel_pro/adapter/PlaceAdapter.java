package l.com.recycel_pro.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import l.com.recycel_pro.R;
import l.com.recycel_pro.model.Place;

public class    PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHoder> {
    private List<Place> places;
    public PlaceAdapter(List<Place> places) {
        this.places = places;
    }

    @NonNull
    @Override
    public PlaceAdapter.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_place, parent, false);
        return new ViewHoder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapter.ViewHoder holder, int position) {
        Place place = places.get(position);
        holder.tvName.setText(place.getPlaceName());

    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        private ImageView imgBackground;
        private ImageView imgStar;
        private TextView tvName;
        public ViewHoder(View itemView) {
            super(itemView);
            imgBackground = itemView.findViewById(R.id.imgBackground);
            tvName = itemView.findViewById(R.id.tvName);
            imgStar = itemView.findViewById(R.id.imgStar);

        }
    }
}
