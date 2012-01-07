import jagdx.IDirect3DDevice;

final class sn {

   static boolean g = false;
   static int a;
   static int f;
   static int d;
   static int e;
   static Object[] b = fra.a(2, (byte)112, new Object[1]);
   static int c;


   static final void a(int var0, int var1, int var2, int var3, Object[] var4) {
      Object[] var5 = ws.a(var0, var1, var2);
      if(var5 != null) {
         sra.a(var4, bl.a((byte)93, (float)((var1 << qqa.e) + iba.b), new Object[2], (float)((var2 << qqa.e) + iba.b), (float)var3), 1);
         var5[7] = var4;
         int var6 = jp.o == wd.a?1:0;
         if(eb.c(86, var4)) {
            if(kca.a(var4, 27381)) {
               var4[11] = usa.e[var6];
               usa.e[var6] = var4;
            } else {
               var4[11] = ri.f_l[var6];
               ri.f_l[var6] = var4;
               bla.b = true;
            }
         } else {
            var4[11] = sfa.g[var6];
            sfa.g[var6] = var4;
         }
      }

   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      sea.a(var0, (Object[])((Object[])var1[33]), (byte)98);
      ++f;
      mf.b((byte)-94, var1);
      if(var2 == 7) {
         if(bsa.b == var1[24]) {
            gpa.a(var1, (int)106);
         }

      }
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 <= -27) {
         if(((boolean[])((boolean[])var0[63]))[16]) {
            int var2 = ((boolean[])((boolean[])var0[78]))[((int[])((int[])var0[1]))[7]]?ou.a(((Object[][])((Object[][])var0[56]))[((int[])((int[])var0[1]))[7]], -127):1;
            IDirect3DDevice.SetTextureStageState(((long[])((long[])var0[50]))[5], ((int[])((int[])var0[1]))[7], 1, var2);
         }

         ++c;
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++d;
      if(null == var1[0]) {
         var1[0] = new char[1];
      }

      if(var0 <= 95) {
         a((byte)27, (Object[])((Object[])var1[9]));
      }

   }

   static final void a(byte var0, int var1, byte[] var2, int var3, int var4, int var5, int var6, Object[] var7, Object[] var8, int var9) {
      ++e;
      if(var0 > -63) {
         g = ((boolean[])((boolean[])b[4]))[1];
      }

      vna.a(1, var2, var1, var7, var3, var5, var8, var9, var6, var4);
   }

   static final void a(Object[] var0, Object[] var1, byte var2, int var3) {
      if(var2 > -15) {
         ((long[])((long[])var0[2]))[1] = ((long[])((long[])((Object[])((Object[])b[1]))[21]))[0];
      }

      ++a;
      if(var3 == 0) {
         ((boolean[])((boolean[])var0[3]))[0] = fh.a(var1, false) == 1;
      }

   }

}
