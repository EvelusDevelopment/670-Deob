import jaggl.OpenGL;

final class cea {

   static int a;
   static Object[] e = ed.a(10, new Object[1], (byte)-110, 114);
   static int d;
   static int g = -1;
   static int c;
   public static int b;
   static int f = 0;


   static final void a(Object[] var0, boolean var1) {
      if(((int[])((int[])var0[1]))[12] != 1) {
         ((int[])((int[])var0[1]))[12] = 1;
         si.a(var0, 7379);
         dca.c(var0, 20);
         kja.a(var0, 117);
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         ((int[])((int[])var0[1]))[20] &= -9;
      }

      ++c;
      if(var1) {
         a(0, (Object[])null, (Object[])null, (Object[])((Object[])e[1]), (Object[])((Object[])var0[0]));
      }

   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, Object[] var3, Object[] var4) {
      if(var0 != 8) {
         return (Object[])null;
      } else {
         ob.a(var3, (byte)75, var2, var1, var4);
         ++a;
         return var4;
      }
   }

   static final void a(Object[] var0, int var1, int var2, Object[] var3, int var4, int var5, int var6, Object[] var7) {
      ++d;
      Object[] var11 = sba.a(new Object[13], 2);
      ((int[])((int[])var11[1]))[10] = var6 << 9;
      if(var5 <= -25) {
         ((int[])((int[])var11[1]))[8] = var1;
         ((int[])((int[])var11[1]))[5] = var4 << 9;
         if(null != var3) {
            var11[9] = var3;
            int var12 = ((int[])((int[])var3[1]))[28];
            if(var7 != null && 2 == var7.length && var7[0].equals(Boolean.valueOf(false))) {
               qn.g = null;
            }

            int var13 = ((int[])((int[])var3[1]))[10];
            if(1 == var2 || 3 == var2) {
               var12 = ((int[])((int[])var3[1]))[10];
               var13 = ((int[])((int[])var3[1]))[28];
            }

            ((int[])((int[])var11[1]))[4] = var13 + var4 << 9;
            ((int[])((int[])var11[1]))[12] = ((int[])((int[])var3[1]))[5];
            ((int[])((int[])var11[1]))[1] = var6 + var12 << 9;
            ((int[])((int[])var11[1]))[9] = ((int[])((int[])var3[1]))[15];
            ((int[])((int[])var11[1]))[3] = ((int[])((int[])var3[1]))[22];
            ((int[])((int[])var11[1]))[11] = ((int[])((int[])var3[1]))[8];
            var11[2] = var3[9];
            ((boolean[])((boolean[])var11[8]))[2] = ((boolean[])((boolean[])var3[0]))[13];
            ((boolean[])((boolean[])var11[8]))[1] = ((boolean[])((boolean[])var3[0]))[8];
            ((int[])((int[])var11[1]))[6] = ((int[])((int[])var3[1]))[39];
            ((int[])((int[])var11[1]))[14] = ((int[])((int[])var3[1]))[37] << 9;
            ((int[])((int[])var11[1]))[13] = ((int[])((int[])var3[1]))[0];
            ((int[])((int[])var11[1]))[0] = ((int[])((int[])var3[1]))[4] << 9;
            if(null != var3[11]) {
               ((boolean[])((boolean[])var11[8]))[0] = true;
               qi.a(var11, true);
            }

            if(null != var11[2]) {
               ((int[])((int[])var11[1]))[7] = ((int[])((int[])var11[1]))[9] + (int)((double)(-((int[])((int[])var11[1]))[9] + ((int[])((int[])var11[1]))[6]) * Math.random());
            }

            client.a(122, fla.a, (lm)(var11 == null?null:var11[11]));
         } else if(null != var0) {
            var11[3] = var0;
            Object[] var14 = (Object[])((Object[])var0[42]);
            if(null != var14[11]) {
               ((boolean[])((boolean[])var11[8]))[0] = true;
               var14 = ria.a(eo.g, var14, -111);
            }

            if(var14 != null) {
               ((int[])((int[])var11[1]))[1] = var6 + ((int[])((int[])var14[1]))[18] << 9;
               ((int[])((int[])var11[1]))[4] = ((int[])((int[])var14[1]))[18] + var4 << 9;
               ((int[])((int[])var11[1]))[13] = ji.a(var0, (byte)124);
               ((int[])((int[])var11[1]))[14] = ((int[])((int[])var14[1]))[28] << 9;
               ((boolean[])((boolean[])var11[8]))[2] = ((boolean[])((boolean[])var14[8]))[0];
               ((int[])((int[])var11[1]))[11] = ((int[])((int[])var14[1]))[16];
               ((int[])((int[])var11[1]))[3] = ((int[])((int[])var14[1]))[2];
               ((int[])((int[])var11[1]))[0] = ((int[])((int[])var14[1]))[5] << 9;
               ((int[])((int[])var11[1]))[12] = ((int[])((int[])var14[1]))[1];
            }

            client.a(-40, nga.g, (lm)(null != var11?var11[11]:null));
         } else if(null != var7) {
            var11[5] = var7;
            ((int[])((int[])var11[1]))[1] = var6 + gn.a(var7, (byte)-105) << 9;
            if(var3 != null && -4 == ~var3.length && var3[2].equals(Integer.valueOf(0))) {
               qn.g = (Object[])((Object[])nga.g[11]);
            }

            ((int[])((int[])var11[1]))[4] = gn.a(var7, (byte)84) + var4 << 9;
            ((int[])((int[])var11[1]))[13] = cja.a((byte)115, var7);
            ((int[])((int[])var11[1]))[3] = 256;
            ((boolean[])((boolean[])var11[8]))[2] = ((boolean[])((boolean[])var7[8]))[12];
            ((int[])((int[])var11[1]))[14] = 0;
            ((int[])((int[])var11[1]))[11] = 256;
            ((int[])((int[])var11[1]))[0] = ((int[])((int[])var7[12]))[46] << 9;
            ((int[])((int[])var11[1]))[12] = ((int[])((int[])var7[12]))[49];
            di.a(qn.g, true, (lm)(var11 == null?null:var11[11]), (long)((int[])((int[])var7[12]))[21]);
         }

      }
   }

}
