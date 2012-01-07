import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

final class kra {

   private GraphicsDevice b;
   private DisplayMode a;


   private final void a(byte var1, Frame var2) {
      boolean var3 = false;
      int var4 = -103 / ((var1 + 56) / 54);

      try {
         Field var5 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
         var5.setAccessible(true);
         boolean var6 = ((Boolean)var5.get(this.b)).booleanValue();
         if(var6) {
            var3 = true;
            var5.set(this.b, Boolean.FALSE);
         }
      } catch (Throwable var16) {
         ;
      }

      boolean var13 = false;

      try {
         var13 = true;
         this.b.setFullScreenWindow(var2);
         var13 = false;
      } finally {
         if(var13) {
            if(var3) {
               try {
                  Field var8 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                  var8.set(this.b, Boolean.TRUE);
               } catch (Throwable var14) {
                  ;
               }
            }

         }
      }

      if(var3) {
         try {
            Field var18 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var18.set(this.b, Boolean.TRUE);
         } catch (Throwable var15) {
            ;
         }
      }

   }

   public final int[] listmodes() {
      DisplayMode[] var1 = this.b.getDisplayModes();
      int[] var2 = new int[var1.length << 2];

      for(int var3 = 0; var1.length > var3; ++var3) {
         var2[var3 << 2] = var1[var3].getWidth();
         var2[1 + (var3 << 2)] = var1[var3].getHeight();
         var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
         var2[3 + (var3 << 2)] = var1[var3].getRefreshRate();
      }

      return var2;
   }

   public final void enter(Frame var1, int var2, int var3, int var4, int var5) {
      this.a = this.b.getDisplayMode();
      if(this.a == null) {
         throw new NullPointerException();
      } else {
         var1.setUndecorated(true);
         var1.enableInputMethods(false);
         this.a((byte)13, var1);
         if(0 == var5) {
            int var6 = this.a.getRefreshRate();
            DisplayMode[] var7 = this.b.getDisplayModes();
            boolean var8 = false;

            for(int var9 = 0; ~var9 > ~var7.length; ++var9) {
               if(~var2 == ~var7[var9].getWidth() && var7[var9].getHeight() == var3 && var7[var9].getBitDepth() == var4) {
                  int var10 = var7[var9].getRefreshRate();
                  if(!var8 || Math.abs(var10 + -var6) < Math.abs(var5 + -var6)) {
                     var8 = true;
                     var5 = var10;
                  }
               }
            }

            if(!var8) {
               var5 = var6;
            }
         }

         this.b.setDisplayMode(new DisplayMode(var2, var3, var4, var5));
      }
   }

   public final void exit() {
      try {
         if(this.a != null) {
            this.b.setDisplayMode(this.a);
            if(!this.b.getDisplayMode().equals(this.a)) {
               throw new RuntimeException("");
            }

            this.a = null;
         }

         this.a((byte)123, (Frame)null);
      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   public kra() throws Exception {
      GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
      this.b = var1.getDefaultScreenDevice();
      if(!this.b.isFullScreenSupported()) {
         GraphicsDevice[] var2 = var1.getScreenDevices();
         GraphicsDevice[] var3 = var2;

         for(int var4 = 0; ~var4 > ~var3.length; ++var4) {
            GraphicsDevice var5 = var3[var4];
            if(null != var5 && var5.isFullScreenSupported()) {
               this.b = var5;
               return;
            }
         }

         throw new Exception();
      }
   }

}
