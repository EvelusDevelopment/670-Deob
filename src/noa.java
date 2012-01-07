import jaggl.OpenGL;

final class noa {

   static int d;
   static int a;
   static Object[] c = ho.a(2, 36, new Object[1], true);
   static int g;
   static int b;
   static boolean e = false;
   static int f_i;
   static int f;
   static int h;


   static final void a(int var0, Object[] var1) {
      ++f;
      if(var0 != 19313) {
         e = false;
      }

      if(var1[0] == null) {
         var1[0] = new long[1];
      }

      if(null == var1[1]) {
         var1[1] = new int[1];
      }

   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      ++a;
      int var7 = var6 + var1;
      int var8 = -var1 + var0;

      int var11;
      for(var11 = var6; var11 < var7; ++var11) {
         fka.a(var3, fda.c[var11], var4, var5, (byte)36);
      }

      if(var2 != 4) {
         c = (Object[])null;
      }

      for(var11 = var0; var8 < var11; --var11) {
         fka.a(var3, fda.c[var11], var4, var5, (byte)84);
      }

      int var10 = var4 + -var1;
      int var9 = var5 + var1;

      for(var11 = var7; var8 >= var11; ++var11) {
         int[] var12 = fda.c[var11];
         fka.a(var3, var12, var9, var5, (byte)81);
         fka.a(var3, var12, var4, var10, (byte)-121);
      }

   }

   static final Object[] a(int var0, Object[] var1, qa var2, Object[] var3) {
      ++h;
      var1[2] = sj.a(256, new Object[3], (byte)-48);
      if(var0 != 256) {
         c = (Object[])((Object[])c[2]);
      }

      var1[1] = var2;
      var1[0] = var3;
      return var1;
   }

   static final void a(int var0, int var1, Object[] var2) {
      if(var1 == 1) {
         ++b;
         iia.a(2, false, var0, var2);
      }
   }

   static final int a(boolean var0, Object[] var1) {
      ++g;
      if(!var0) {
         a((Object[])null, ((int[])((int[])var1[1]))[0], (Object[])null);
      }

      if(null == var1) {
         throw new IllegalStateException();
      } else {
         return kma.a((int)-11031, var1);
      }
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != 36) {
         return ((int[])((int[])c[2]))[27];
      } else {
         ++f_i;
         return ((int[])((int[])var0[1]))[0];
      }
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      if(var1 != 18874) {
         return (Object[])null;
      } else {
         if(null == var0[5]) {
            var0[5] = new int[5];
         }

         ++d;
         dp var4 = new dp(var0);
         var0[0] = var2;
         var0[1] = var4;
         var0[2] = new Object[4][];
         var0[4] = var2;
         int[] var3 = new int[1];
         OpenGL.glGenFramebuffersEXT(1, var3, 0);
         ((int[])((int[])var0[5]))[2] = var3[0];
         return var0;
      }
   }

}
