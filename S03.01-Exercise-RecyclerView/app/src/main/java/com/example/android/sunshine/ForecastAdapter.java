package com.example.android.sunshine;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nick on 2/28/2018.
 */
public class ForecastAdapter
        extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] weatherData;

    public ForecastAdapter() {

    }

    @NonNull
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.forecast_list_item, parent, false);
        return new ForecastAdapterViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder holder, int position) {

        holder.weatherTextView.setText(weatherData[position]);

    }

    @Override
    public int getItemCount() {

        if (weatherData == null) {

            return 0;

        }
        else {

            return weatherData.length;

        }

    }

    public void setWeatherData(String[] weatherData) {

        this.weatherData = weatherData;
        notifyDataSetChanged();

    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        public final TextView weatherTextView;

        public ForecastAdapterViewHolder(View itemView) {

            super(itemView);
            weatherTextView = itemView.findViewById(R.id.tv_weather_data);

        }

    }

}
