package ram.ramires.toolbar2;


public class MyToolbar extends MainActivity {/*
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
    }*/
}
