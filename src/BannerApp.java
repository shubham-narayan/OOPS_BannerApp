public class BannerApp{
     public static void main(String[] args) {
        String[] banners = new String[7];
        banners[0] = String.join("", "   ***  ", "    ***  ", " ******   ", "    *****   ");
        banners[1] = String.join("", " **  ** ", "  **  ** ", " **    ** ", "  **        ");
        banners[2] = String.join("", "**    **", " **    **", " **     **", " **         ");
        banners[3] = String.join("", "**    **", " **    **", " **    ** ", "   *****    ");
        banners[4] = String.join("", "**    **", " **    **", " ******   ", "         ** ");
        banners[5] = String.join("", " **  ** ", "  **  ** ", " **       ", "  **     ** ");
        banners[6] = String.join("", "  ***   ", "   ***   ", " **       ", "    *****   ");

        for (int i = 0; i < banners.length; i++) {
            System.out.println(banners[i]);
        }
    }
}