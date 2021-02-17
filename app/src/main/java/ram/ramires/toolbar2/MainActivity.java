package ram.ramires.toolbar2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionMenuView;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import ram.ramires.toolbar2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
        ActivityMainBinding binding=DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(binding.toolbarUp);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the toolbar menu
        getMenuInflater().inflate(R.menu.toolbar_menu_up, menu);

        // Inflate and initialize the bottom menu
        ActionMenuView bottomBar = (ActionMenuView)findViewById(R.id.toolbar_down);
        Menu bottomMenu = bottomBar.getMenu();
        getMenuInflater().inflate(R.menu.toolbar_menu_down, bottomMenu);
        for (int i = 0; i < bottomMenu.size(); i++) {
            bottomMenu.getItem(i).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    return onOptionsItemSelected(item);
                }
            });
        }
        return true;
    }
}