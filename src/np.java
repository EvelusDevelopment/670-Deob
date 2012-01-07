import jaggl.OpenGL;
import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer.Info;

final class np {

   static int c;
   static int d;
   static int e;
   static int b;
   static Object[] f_i = sj.a(20, new Object[3], (byte)-85);
   static Object[] f = mpa.a(1, new Object[10]);
   static int a;
   static int h = 0;
   static int g;


   static final boolean a(Object[] var0, byte var1) {
      if(var1 > -109) {
         return true;
      } else {
         ++b;
         return false;
      }
   }

   static final void a(int var0, Object[] var1) {
      ((int[])((int[])var1[1]))[1] = 0;
      ++c;
      int var2 = 5 % ((var0 + 44) / 49);
      ((int[])((int[])var1[1]))[4] = 1365;
      ((int[])((int[])var1[1]))[3] = 20;
      ((int[])((int[])var1[1]))[2] = 0;
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      if(null == var2[3]) {
         ib.a(1, (Object[])((Object[])var2[6]), var1);
         uh.a(var2, 2);
         if(var2[1] != null) {
            wv.a(10588, (Object[])((Object[])var2[1]));
         }
      } else {
         Object[] var4 = new Object[3];
         rca var6 = new rca(var4);
         var4[0] = var6;
         var4[2] = wua.a(true, new Object[2]);
         var4[1] = nj.a(3, new Object[2]);
         ib.a(1, var4, var1);
         hi.a(var4, ira.a((Object[])((Object[])var2[3]), true), (byte)110);
         ib.a(1, (Object[])((Object[])var2[6]), var4);
         uh.a(var2, 2);
         if(var2[1] != null) {
            wv.a(10588, (Object[])((Object[])var2[1]));
         }
      }

      int var3 = -64 / ((var0 - 42) / 41);
      ++e;
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, int var3, Object[] var4, Object[] var5, boolean var6, int var7) {
      md.b(var4, 0);
      ++d;
      ((boolean[])((boolean[])var4[3]))[1] = false;
      var4[0] = tia.a(0, var4);
      if(null != var1 && var1.length == 2) {
         return null;
      } else {
         ((int[])((int[])var4[1]))[0] = var7;
         var4[4] = var2;
         var4[2] = var1;
         ((boolean[])((boolean[])var4[3]))[0] = var6;
         var4[5] = var5;
         ((int[])((int[])var4[1]))[2] = var3;
         OpenGL.glGenTextures(1, ws.u, 0);
         ((int[])((int[])var4[1]))[var0] = ws.u[0];
         uia.a(0, var4, -95);
         return var4;
      }
   }

   static final void a(Component var0, byte var1, Object[] var2) {
      ++g;
      Info[] var3 = AudioSystem.getMixerInfo();
      if(var3 != null) {
         Info[] var4 = var3;

         for(int var5 = 0; var4.length > var5; ++var5) {
            Info var6 = var4[var5];
            if(null != var6) {
               String var7 = var6.getName();
               if(var7 != null && var7.toLowerCase().indexOf("soundmax") >= 0) {
                  ((boolean[])((boolean[])var2[0]))[2] = true;
               }
            }
         }

         if(var2 != null && 1 == var2.length) {
            return;
         }
      }

      if(var1 != 92) {
         a((Object[])null, (byte)-82);
      }

      var2[7] = new AudioFormat((float)mc.a, 16, !df.g?1:2, true, false);
      var2[8] = new byte[256 << (df.g?2:1)];
   }

}
