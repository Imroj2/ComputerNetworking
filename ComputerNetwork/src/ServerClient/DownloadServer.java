package ServerClient;
import java.io.*;
import java.net.*;

public class DownloadServer {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        if (args.length > 0) {
            try {
                // Open the URLConnection for reading
                @SuppressWarnings("deprecation")
				URL u = new URL(args[0]);
                URLConnection uc = u.openConnection();
                try (InputStream raw = uc.getInputStream()) { // autoclose
                    InputStream buffer = new BufferedInputStream(raw);
                    // chain the InputStream to a Reader
                    Reader reader = new InputStreamReader(buffer);
                    int c;
                    while ((c = reader.read()) != -1) {
                        System.out.print((char) c);
                    }
                }
            } catch (MalformedURLException ex) {
                System.err.println(args[0] + " is not a parseable URL");
            } catch (IOException ex) {
                System.err.println("An IOException occurred: " + ex.getMessage());
            }
        } else {
            System.err.println("Please provide a URL as an argument.");
        }
    }
}
