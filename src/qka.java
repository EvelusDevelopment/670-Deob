import jaggl.OpenGL;

final class qka {

   static int b;
   static Object[] a = ed.a(5, new Object[1], (byte)-128, 81);
   static int f;
   static int c;
   static int e;
   static int d;


   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      int var3 = 127 % ((var1 - 60) / 54);
      ++f;
      Object[] var4 = mp.a(false, var2);
      ((float[])((float[])var4[1]))[1] -= ((float[])((float[])var0[1]))[1];
      ((float[])((float[])var4[1]))[2] -= ((float[])((float[])var0[1]))[2];
      ((float[])((float[])var4[1]))[0] -= ((float[])((float[])var0[1]))[0];
      return var4;
   }

   static final Object[] a(int var0, Object[] var1, int var2, int var3, int var4, int var5, Object[] var6, int var7) {
      ++d;
      vt.a(var6, (int)-7);
      np.a(1, hf.d, var1, var3, var6, vk.f, false, var7 * var4);
      ((int[])((int[])var6[1]))[4] = var7;
      ((int[])((int[])var6[1]))[3] = var4;
      moa.a((byte)100, var6, (Object[])((Object[])var6[4]));
      if(var5 != 2) {
         a(-34, new Object[2], -40, ((int[])((int[])var6[0]))[5], ((int[])((int[])var1[1]))[3], 103, (Object[])null, 90);
      }

      if(var1 != null && (-5 == ~var1.length && var1[2].equals(Integer.valueOf(2)) || -4 == ~var1.length && var1[0].equals(Integer.valueOf(1)))) {
         qpa.a(false, 115, (Object[])null, true, 126, (int[])null, (Object[])null, -67, -3, -103, 123);
      }

      Object[] var8;
      ue var9 = ((ta)(null == (var8 = (Object[])((Object[])var6[4]))?null:var8[55])).e(30626);
      if(null != var9) {
         int var10 = var9.d() - (var2 + var7);
         int var11 = bu.a(110, (Object[])((Object[])var6[5]), (Object[])((Object[])var6[2]));
         OpenGL.glCopyTexImage2D(((int[])((int[])var6[1]))[2], 0, var11, var0, var10, var4, var7, 0);
      }

      gg.a((byte)-48, var6, true);
      return var6;
   }

   static final int a(int var0, Object[] var1) {
      ++c;
      if(var0 != -23864) {
         a = (Object[])null;
      }

      int var2 = ((int[])((int[])var1[1]))[0] * ((int[])((int[])((Object[])((Object[])var1[2]))[0]))[0] * ((int[])((int[])((Object[])((Object[])var1[5]))[0]))[1];
      return !((boolean[])((boolean[])var1[3]))[0]?var2:var2 * 4 / 3;
   }

   static final void a(int var0, int var1, Object[] var2) {
      synchronized(var2[1]) {
         fua.a(var0 - 6841, (Object[])((Object[])var2[1]), var1);
      }

      if(var0 == 6762) {
         ++e;
      }
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      ++b;
      if(var2 == null || var2.length != 15) {
         if(var0 == 15) {
            ;
         }
      }
   }

   static {
      wua.a(true, new Object[2]);
   }
}
