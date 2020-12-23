package ru.xbitly.navigationdrawer.ui.gallery;

    import android.os.Bundle;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.fragment.app.Fragment;

    import ru.xbitly.navigationdrawer.R;

public class GalleryFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container,
                false);
        final TextView textView = root.findViewById(R.id.text_slideshow);

        textView.setText("Gallery");

        return root;
    }
}