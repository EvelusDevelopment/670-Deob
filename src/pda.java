import jaggl.OpenGL;
import java.awt.Canvas;

final class pda {

   static int f;
   static int g;
   static int h;
   static int e;
   static int b;
   static Object[] a = ho.a(-1, 4, new Object[1], true);
   static int d;
   static int c;


   static final void a(Object[] var0, int var1) {
      ++d;
      if(var1 > -54) {
         a = (Object[])null;
      }

      if(!((boolean[])((boolean[])var0[5]))[0]) {
         ((OpenGL)var0[3]).releaseSurface((Canvas)var0[0], ((long[])((long[])var0[6]))[0]);
         ((boolean[])((boolean[])var0[5]))[0] = true;
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(Object[] var0, int var1, boolean var2) {
      if(!var2 != !((boolean[])((boolean[])var0[17]))[10]) {
         ((boolean[])((boolean[])var0[17]))[10] = var2;
         if(((boolean[])((boolean[])var0[17]))[10] && !((boolean[])((boolean[])var0[17]))[14]) {
            OpenGL.glEnable(2896);
         } else {
            OpenGL.glDisable(2896);
         }

         ((int[])((int[])var0[1]))[20] &= -8;
      }

      if(var1 != -21342) {
         a((Object[])((Object[])var0[1]), -82);
      }

      ++h;
   }

   static final int a(boolean var0, Object[] var1) {
      ++b;
      if(!var0) {
         a((Object[])((Object[])var1[1]), ((int[])((int[])a[3]))[0], ((boolean[])((boolean[])a[3]))[27]);
      }

      return ((int[])((int[])var1[1]))[0];
   }

   static final void a(int var0, Object[] var1) {
      if(var1[1] == null) {
         var1[1] = new int[10];
      }

      ++f;
      int var2 = -111 % ((var0 + 64) / 57);
   }

   static final void a(boolean var0, boolean var1, Object[] var2, boolean var3) {
      if(var1) {
         a((Object[])null, -26, false);
      }

      if(-3554 == ~((int[])((int[])var2[1]))[2]) {
         moa.a((byte)119, var2, (Object[])((Object[])var2[4]));
         OpenGL.glTexParameteri(((int[])((int[])var2[1]))[2], 10242, !var0?'\u812f':10497);
         OpenGL.glTexParameteri(((int[])((int[])var2[1]))[2], 10243, !var3?'\u812f':10497);
      }

      ++e;
   }

   static final boolean b(int var0, Object[] var1) {
      ++g;
      int var2 = -88 % ((var0 + 25) / 39);
      if(var1 == null) {
         throw new IllegalStateException();
      } else {
         return vna.a(57, var1);
      }
   }

}
