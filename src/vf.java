import jaggl.OpenGL;

final class vf extends lm {

   static Object[] f_l = ho.a(0, 3, new Object[1], true);
   static int j;
   Object[] m;
   static int k;
   static int n;
   static int o;


   static final int a(int var0) {
      if(var0 != 1) {
         a(7, -104, 96, ((boolean[])((boolean[])((Object[])((Object[])f_l[0]))[5]))[9]);
      }

      ++n;
      return dq.h;
   }

   static final void a(Object[] var0, byte var1) {
      ++k;
      cv.a(false, var0);
      var0[13] = null;
      if(var1 < 118) {
         f_l = new Object[7];
      }

   }

   vf(Object[] var1) {
      this.m = var1;
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ++j;
      if(var2 != 5) {
         a(126, 49, ((int[])((int[])var1[3]))[2], false);
      }

      if(var1[44] != var0) {
         if(((boolean[])((boolean[])var1[17]))[15]) {
            int var3;
            if(null != var0 && var0.length == 5) {
               var3 = bh.a(var0, var2 - 73);
            } else {
               if(null == var0 || -3 != ~var0.length) {
                  throw new IllegalStateException();
               }

               var3 = ur.a(var0, (byte)113);
            }

            OpenGL.glBindBufferARB('\u8892', var3);
         }

         var1[44] = var0;
      }

   }

   static final void a(int var0, int var1, int var2, boolean var3) {
      ++o;
      if(pm.a((long)var0, fo.c, false) == null) {
         if(!ed.c) {
            he.a(var0, var3, 41);
         } else {
            Object[] var6 = new Object[4];
            Object[] var7 = ur.a(4096, dra.g, new Object[16], false, var0);
            if(null == var6[1]) {
               var6[1] = new int[2];
            }

            if(var6[3] == null) {
               var6[3] = new boolean[4];
            }

            oc var9 = new oc(var6);
            var6[0] = var9;
            ((int[])((int[])var6[1]))[0] = var0;
            var6[2] = var7;
            if(null != var6 && -21 == ~var6.length && var6[4].equals(Integer.valueOf(2)) && var6[4].equals(Integer.valueOf(1))) {
               il.a(-62);
            }

            ((int[])((int[])var6[1]))[1] = var1;
            ((boolean[])((boolean[])var6[3]))[2] = var3;
            wha.a(rd.r[dp.y], var2 ^ 1, (Object[])((Object[])var6[2]));
            di.a(fo.c, true, (lm)(var6 == null?null:var6[0]), (long)var0);
         }
      }

      if(var2 != 4) {
         ((int[])((int[])f_l[14]))[4] = ((int[])((int[])f_l[2]))[10];
      }

   }

}
