import jaggl.OpenGL;
import java.awt.event.KeyEvent;

final class kma {

   static int a;
   static int b = 0;
   static int d;
   static int e;
   static int g;
   static int h;
   static int c;
   static int[] f;


   static final void a(byte var0, Object[] var1) {
      ++e;
      synchronized(var1[2]) {
         dq.a(44, (Object[])((Object[])var1[2]));
      }

      synchronized(var1[0]) {
         dq.a(-91, (Object[])((Object[])var1[0]));
      }

      if(var0 != -87) {
         ((int[])((int[])var1[5]))[2] = -110;
      }

   }

   static final void a(byte var0, KeyEvent var1, int var2, Object[] var3) {
      ++d;
      if(var0 != 26) {
         a(((int[])((int[])var3[15]))[0], true, -60);
      }

      int var4 = var1.getKeyCode();
      if(var4 != 0) {
         if(0 <= var4 && var4 < sca.b.length) {
            var4 = sca.b[var4];
            if(0 == var2 && (128 & var4) != 0) {
               var4 = 0;
            } else {
               var4 &= -129;
            }
         } else {
            var4 = 0;
         }
      } else {
         var4 = 0;
      }

      if(0 != var4) {
         he.a(var2, var4, false, '\uffff', var3);
         var1.consume();
      }
   }

   static final void a(int var0, boolean var1, int var2) {
      ++a;
      if(dl.d != 0) {
         if(var2 < 0) {
            for(int var3 = 0; 16 > var3; ++var3) {
               wma.e[var3] = var0;
            }
         } else {
            wma.e[var2] = var0;
         }
      }

      uka.a(var2, 122, var0, qs.h);
      if(!var1) {
         a((int)-97, (Object[])null);
      }

   }

   static final int a(int var0, Object[] var1) {
      ++g;
      if(var0 != -11031) {
         b = ((int[])((int[])var1[3]))[1];
      }

      return ((int[])((int[])var1[1]))[1];
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      ++jna.f;
      ++h;
      Object[] var3 = ona.a((byte)119, (Object[])((Object[])lba.f[7]), qba.f);
      ij.a(((int[])((int[])var0[1]))[47], (byte)126, (Object[])((Object[])var3[0]));
      ij.a(((int[])((int[])var0[1]))[13], (byte)126, (Object[])((Object[])var3[0]));
      oca.a(var1 + 119, ((int[])((int[])var2[var1]))[13], (Object[])((Object[])var3[0]));
      op.putInt((Object[])((Object[])var3[0]), ((int[])((int[])var2[1]))[3]);
      ij.a(((int[])((int[])var2[1]))[47], (byte)126, (Object[])((Object[])var3[0]));
      op.putInt((Object[])((Object[])var3[0]), ((int[])((int[])var0[1]))[3]);
      lj.a(var3, 6, lba.f);
   }

   static final void a(boolean var0, Object[] var1, byte var2) {
      label11: {
         int var3 = 126 % ((var2 - 35) / 54);
         if(!var0) {
            OpenGL.glDisable('\u809d');
            if(client.f_vb == 0) {
               break label11;
            }
         }

         OpenGL.glEnable('\u809d');
      }

      ++c;
   }

   static {
      je.a(3, new Object[1], 0, (byte)-107);
   }
}
