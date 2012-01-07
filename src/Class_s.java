import jagdx.IDirect3DDevice;

abstract class Class_s {

   static int a;
   static int h;
   static int f_i;
   static int c;
   static int f;
   static Object[] j = sd.a(new Object[1], 35, (byte)114);
   static int e;
   static int[] b = new int[]{32, 39, 45, 50};
   static int d;
   static int g;


   static final cga a(int var0, Object[] var1, ta var2) {
      ++g;
      if(var0 != -31976) {
         return (cga)null;
      } else if(((int[])((int[])var1[1]))[2] < 0) {
         return null;
      } else {
         cga var3 = (cga)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var1[2]))[0]), (long)((int[])((int[])var1[1]))[2]);
         if(null == var3) {
            jja.a(var2, 2, var1);
            var3 = (cga)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var1[2]))[0]), (long)((int[])((int[])var1[1]))[2]);
         }

         return var3;
      }
   }

   static final void a(Object[] var0, byte var1) {
      ++d;
      if(var0 != null && var0.length == 87) {
         ((float[])((float[])var0[0]))[16] = ((float[])((float[])var0[0]))[14] - (float)((int[])((int[])var0[1]))[22];
         ((float[])((float[])var0[0]))[13] = ((float[])((float[])var0[0]))[16] - (float)((int[])((int[])var0[1]))[4];
         if(((float[])((float[])var0[0]))[13] < ((float[])((float[])var0[0]))[7]) {
            ((float[])((float[])var0[0]))[13] = ((float[])((float[])var0[0]))[7];
         }

         if(((boolean[])((boolean[])var0[63]))[16]) {
            IDirect3DDevice.a(((long[])((long[])var0[50]))[5], 36, ((float[])((float[])var0[0]))[13]);
            IDirect3DDevice.a(((long[])((long[])var0[50]))[5], 37, ((float[])((float[])var0[0]))[16]);
            IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 34, ((int[])((int[])var0[1]))[15]);
         }

      } else if(var1 > 113) {
         if(null != var0 && 91 == var0.length) {
            tka.b((byte)-120, var0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(int var0, Object[] var1) {
      if(var1[1] == null) {
         var1[1] = new int[1];
      }

      ++a;
      if(var0 > -67) {
         b = (int[])null;
      }

   }

   static final void c(int var0, Object[] var1) {
      int var2 = -98 / ((var0 - 35) / 45);
      ++f;
      if(((boolean[])((boolean[])var1[63]))[16] && !((boolean[])((boolean[])var1[63]))[21]) {
         IDirect3DDevice.LightEnable(((long[])((long[])var1[50]))[5], 0, false);
         IDirect3DDevice.LightEnable(((long[])((long[])var1[50]))[5], 1, false);
         IDirect3DDevice.SetLight(((long[])((long[])var1[50]))[5], 0, ((long[])((long[])var1[50]))[3]);
         IDirect3DDevice.SetLight(((long[])((long[])var1[50]))[5], 1, ((long[])((long[])var1[50]))[2]);
         IDirect3DDevice.LightEnable(((long[])((long[])var1[50]))[5], 0, true);
         IDirect3DDevice.LightEnable(((long[])((long[])var1[50]))[5], 1, true);
         ((boolean[])((boolean[])var1[63]))[21] = true;
      }

   }

   static final boolean a(int var0, byte var1) {
      ++c;
      if(var1 != -101) {
         j = (Object[])((Object[])((Object[])((Object[])j[3]))[3]);
      }

      return var0 >= 0 && 3 >= var0 || 9 == var0;
   }

   static final void b(int var0, Object[] var1) {
      if(var1[1] == null) {
         var1[1] = new int[2];
      }

      ++h;
      if(var0 != 7) {
         a(((int[])((int[])j[1]))[13], (Object[])((Object[])var1[1]), (ta)null);
      }

   }

   static final int a(Object[] var0, byte var1, String var2) {
      if(var1 > 0) {
         j = (Object[])((Object[])((Object[])((Object[])var0[11]))[23]);
      }

      ++f_i;
      if(null != var0 && var0.length == 4) {
         return 18;
      } else {
         for(int var3 = 0; var3 < ((int[])((int[])var0[1]))[0]; ++var3) {
            if(((String)((Object[][])((Object[][])var0[0]))[var3][2]).equalsIgnoreCase(var2)) {
               return var3;
            }
         }

         return -1;
      }
   }

   static final void a(boolean var0, Object[] var1) {
      ++e;
      if(var1 != null && (7 == var1.length || var1.length >= 9)) {
         lg.a((byte)95, var1);
      } else if(null == var1 || var1.length != 1) {
         if(null != var1 && (var1.length == 3 || -9 == ~var1.length)) {
            nea.a(2, var1);
         } else if(var1 != null && -6 == ~var1.length) {
            var1[1] = ib.a((Object[])((Object[])var1[0]), 16, ((int[])((int[])((Object[])((Object[])var1[3]))[0]))[0]);
         } else if(null != var1 && var1.length == 2) {
            jra.a(-27497, var1);
         } else if(var0) {
            if(null != var1 && 4 == var1.length) {
               ja.a((byte)-65, var1);
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }

}
