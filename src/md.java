import jaggl.OpenGL;

final class md {

   static Object[] c;
   static int h;
   static int f_l;
   static int b;
   static int d = -2;
   static int e;
   static int a;
   static int k;
   static int j;
   static Object[] f_i;
   static int f;
   static Object[] g;


   static final void a(int var0, Object[] var1) {
      ((float[])((float[])var1[76]))[0] = ((float[])((float[])var1[0]))[8] * ((float[])((float[])var1[0]))[11];
      ++h;
      ((float[])((float[])var1[76]))[2] = ((float[])((float[])var1[0]))[3] * ((float[])((float[])var1[0]))[8];
      ((float[])((float[])var1[76]))[3] = 1.0F;
      ((float[])((float[])var1[76]))[1] = ((float[])((float[])var1[0]))[2] * ((float[])((float[])var1[0]))[8];
      OpenGL.glLightfv(16384, 4609, (float[])((float[])var1[76]), 0);
      ((float[])((float[])var1[76]))[1] = -((float[])((float[])var1[0]))[0] * ((float[])((float[])var1[0]))[2];
      if(var0 != -1) {
         a(-74, (Object[])null, (Object[])((Object[])g[19]), (Object[])null);
      }

      ((float[])((float[])var1[76]))[3] = 1.0F;
      ((float[])((float[])var1[76]))[0] = ((float[])((float[])var1[0]))[11] * -((float[])((float[])var1[0]))[0];
      ((float[])((float[])var1[76]))[2] = -((float[])((float[])var1[0]))[0] * ((float[])((float[])var1[0]))[3];
      OpenGL.glLightfv(16385, 4609, (float[])((float[])var1[76]), 0);
   }

   static final void a(int var0, int var1, int var2, byte var3) {
      int var4 = 94 % ((var3 + 68) / 42);
      var2 = hba.a((Object[])((Object[])tu.d[26]), 0) * var2 >> 8;
      ++e;
      if(var2 != 0 && -1 != var0) {
         if(!qk.d && si.b != -1) {
            boolean var5;
            if(0 != dl.d) {
               var5 = true;
            } else {
               var5 = oc.c(-92, qs.h);
            }

            if(var5 && !mg.a(true)) {
               Object[] var6 = qs.h;
               br.j = var6;
               Object[] var7 = jia.a(br.j, (byte)39);
               Class_d.a(true, false, var7);
            }
         }

         uia.a(-17380, 0, false, var0, nh.d, var2);
         kma.a(255, true, -1);
         qk.d = true;
      }

   }

   static final void a(Object[] var0, int var1) {
      if(var0[1] == null) {
         var0[1] = new int[3];
      }

      if(var1 <= 105) {
         ((long[])((long[])g[11]))[15] = ((long[])((long[])((Object[])((Object[])var0[0]))[0]))[9];
      }

      ++b;
   }

   static final boolean a(Object[] var0, byte var1) {
      ++a;
      if(var1 != 21) {
         a(-78, (Object[])null, (Object[])null, (Object[])((Object[])g[2]));
      }

      boolean var2 = true;
      if(!hp.a(-126, (Object[])((Object[])var0[5]), ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[5])) {
         var2 = false;
      }

      if(!hp.a(-124, (Object[])((Object[])var0[3]), ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[5])) {
         var2 = false;
      }

      return var2;
   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      ++f_l;
      synchronized(var3) {
         Object[] var7 = ps.a((byte)-120, var2, new Object[2]);
         ((lm)(null == var7?null:var7[0])).e = (long)var1;
         if(var0 == 14) {
            client.a(120, (Object[])((Object[])var3[81]), (lm)(null == var7?null:var7[0]));
         }
      }
   }

   static final void a(Object[] var0, boolean var1) {
      if(null == var0[14]) {
         var0[14] = new short[2];
      }

      if(!var1) {
         a((Object[])null, false);
      }

      if(var0[9] == null) {
         var0[9] = new byte[9];
      }

      if(var0[8] == null) {
         var0[8] = new boolean[8];
      }

      ++f;
      if(null == var0[1]) {
         var0[1] = new int[33];
      }

   }

   static final void a(int var0, Object[] var1, Object[] var2, Object[] var3) {
      if(var0 >= 40) {
         ++j;
         lca.a((byte)-122, ((Object[][])((Object[][])var1[3]))[((int[])((int[])var1[1]))[2]], var2, var3);
      }
   }

   static final void b(Object[] var0, int var1) {
      if(null == var0[3]) {
         var0[3] = new boolean[2];
      }

      ++k;
      if(null == var0[1]) {
         var0[1] = new int[3];
      }

      if(var1 != 0) {
         a(11, (Object[])null);
      }

   }

   static {
      Object[] var1 = new Object[0];
      g = var1;
      var1 = new Object[0];
      f_i = var1;
      var1 = new Object[0];
      c = var1;
   }
}
