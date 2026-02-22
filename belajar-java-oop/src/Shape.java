class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        // menggunakan perintah super. untuk akses ke getCorner di parent line 2
        return super.getCorner();
    }
}