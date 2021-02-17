package ram.ramires.toolbar2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import ram.ramires.toolbar2.databinding.FragmentToolBarBinding;

public class FragmentToolBar extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentToolBarBinding binding=FragmentToolBarBinding.inflate(inflater,container,false);
        view=binding.getRoot();
        setHasOptionsMenu(true);

        return view;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.position1:
                Loger.log("position1 is clicked");
                break;
            case R.id.position2:
                Loger.log("position2 is clicked");
                break;
            case R.id.cart:
                Loger.log("cart is clicked");
                break;
            case R.id.menu:
                Loger.log("menu is clicked");
                break;
            case R.id.favorites:
                Loger.log("favorites is clicked");
                break;
            case R.id.orders:
                Loger.log("orders is clicked");
                break;
            case R.id.profile:
                Loger.log("profile is clicked");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        requireActivity().getMenuInflater().inflate(R.menu.toolbar_menu_up, menu);

        // Inflate and initialize the bottom menu
        ActionMenuView bottomBar = (ActionMenuView)view.findViewById(R.id.toolbar_down);
        Menu bottomMenu = bottomBar.getMenu();
        requireActivity().getMenuInflater().inflate(R.menu.toolbar_menu_down, bottomMenu);
        for (int i = 0; i < bottomMenu.size(); i++) {
            bottomMenu.getItem(i).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    return onOptionsItemSelected(item);
                }
            });
        }
    }
}