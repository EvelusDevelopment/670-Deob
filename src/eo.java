import jagdx.IDirect3DDevice;

final class eo implements re, lua {

   static int e;
   static int b = 0;
   static Object[] g;
   static int f_l;
   static int a;
   static int f_i;
   static int c;
   static int j;
   static int k;
   static int f;
   Object[] d;
   static float h;


   public final int c() {
      ++c;
      return tn.b(this.d, (byte)-43);
   }

   public final void a() {
      ++a;
      jn.a(this.d, 27395);
   }

   static final void a(byte var0) {
      ++f_l;
      bw.b = 4;
      rq.c = 0;
      ew.f_l = null;
      us.b = 0;
      ai.h = -1;
      ffa.b = (int[][])null;
      ms.a(0);
      sla.b = 0;
      ld.a = 0;
      qm.d = 0;
      rs.f = 0;
      int var1 = -103 % ((-15 - var0) / 51);

      for(int var2 = 0; var2 < gqa.b.length; ++var2) {
         gqa.b[var2] = null;
      }

      ofa.b = 0;

      for(var1 = 0; 2048 > var1; ++var1) {
         jga.g[var1] = null;
         wua.c[var1] = 1;
         uja.h[var1] = null;
      }

      for(var1 = 0; 2048 > var1; ++var1) {
         vo.E[var1] = null;
      }

      rba.h = 0;
      ona.a(hf.g, 59);
      oqa.g = 0;
      ona.a(vg.e, 51);
      sma.a(-114);
      dca.f_i = 0;
      vha.a(2, g);
      pn.b = null;
      vma.b = null;
      fh.b = null;
      qaa.j = null;
      tra.b = 0L;
      eb.e = null;
   }

   eo(Object[] var1) {
      this.d = var1;
   }

   static final Object[] a(int var0, Object[] var1, byte var2, boolean var3, Object[] var4, int var5, int var6, byte[] var7) {
      if(var2 != -70) {
         return (Object[])null;
      } else {
         ++f_i;
         return wv.a(var7, var5, var4, var6, var1, var0, 125, var3, new Object[13]);
      }
   }

   static final void a(int var0, Object[] var1, int var2, int var3, int var4, int var5, int var6) {
      ++e;
      el.a(113, (Object[])((Object[])var1[0]));
      aqa.a(var2, (Object[])((Object[])var1[0]), 53);
      Object[] var9 = (Object[])((Object[])((Object[])((Object[])var1[0]))[10]);
      var9[8] = var1[4];
      sca.a(var4, var9, var5, var3 + 15);
      var6 += ((int[])((int[])var1[1]))[0];
      var0 += ((int[])((int[])var1[1]))[2];
      Object[] var7;
      float var10 = (float)((ta)((var7 = (Object[])((Object[])var1[0])) != null?var7[38]:null)).e(30626).e();
      Object[] var8;
      float var11 = (float)((ta)(null == (var8 = (Object[])((Object[])var1[0]))?null:var8[38])).e(30626).d();
      vt.a((float)((int[])((int[])var1[1]))[4] * 2.0F / var10, (byte)-67, (Object[])((Object[])var9[4]), 2.0F * (float)((int[])((int[])var1[1]))[3] / var11, 1.0F, 1.0F);
      ((float[])((float[])((Object[])((Object[])var9[4]))[0]))[12] = 2.0F * ((float)var0 + ck.a(87, (Object[])((Object[])var1[0]))) / var10 - 1.0F;
      ((float[])((float[])((Object[])((Object[])var9[4]))[0]))[13] = -1.0F + (ck.a(87, (Object[])((Object[])var1[0])) + (float)var6) * 2.0F / var11;
      ((float[])((float[])((Object[])((Object[])var9[4]))[0]))[14] = -1.0F;
      vt.a(wv.a((byte)-126, (float)((int[])((int[])var1[var3]))[4], (Object[])((Object[])var1[4])), (byte)125, (Object[])((Object[])var9[6]), rra.a((Object[])((Object[])var1[4]), (float)((int[])((int[])var1[1]))[3], (byte)-124), 1.0F, 1.0F);
      var9[3] = ((Object[])((Object[])var1[0]))[23];
      var9[2] = ((Object[])((Object[])var1[0]))[17];
      ((int[])((int[])var9[1]))[0] = 0;
      Class_ss.a(var9, (int)5);
      if(null == var1 || -4 != ~var1.length || !var1[2].equals(Integer.valueOf(2))) {
         ;
      }
   }

   public final int b() {
      ++k;
      return hq.a(this.d, 1);
   }

   static final void a(Object[] var0, byte var1) {
      ++j;
      if(((boolean[])((boolean[])var0[63]))[16]) {
         int var2 = ((boolean[])((boolean[])var0[78]))[((int[])((int[])var0[1]))[7]]?ou.a(((Object[][])((Object[][])var0[22]))[((int[])((int[])var0[1]))[7]], -127):1;
         IDirect3DDevice.SetTextureStageState(((long[])((long[])var0[50]))[5], ((int[])((int[])var0[1]))[7], 4, var2);
      }

      if(var1 > -54) {
         a(((byte[])((byte[])var0[10]))[1]);
      }

   }

   static final int a(int var0, Object[] var1) {
      if(var0 != 1) {
         a(27, (Object[])((Object[])var1[7]), 112, -5, 1, -26, 98);
      }

      ++f;
      return ((int[])((int[])var1[1]))[3];
   }

}
