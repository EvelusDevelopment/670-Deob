import jaggl.OpenGL;

final class qm {

   static int f;
   static int a;
   static int e;
   static int b;
   static int c;
   static int d;


   static final int a(int var0, int var1, int var2, int var3) {
      var1 &= 3;
      ++b;
      if(var2 != 7) {
         d = -118;
      }

      return 0 == var1?var0:(var1 != 1?(var1 != 2?-var3 + 7:7 - var0):var3);
   }

   static final void a(byte var0, Object[] var1) {
      ++a;
      if(null == var1[0]) {
         var1[0] = new int[3];
      }

      if(var0 != 58) {
         ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[7] = -125;
      }

   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, byte var3, int var4) {
      dk.a((byte)-114, var1);
      ++f;
      var1[2] = pna.a((int)-2315, var1);
      if(var3 != -13) {
         a(-78, (Object[])((Object[])var1[3]), -10);
      }

      var1[0] = var2;
      ((int[])((int[])var1[1]))[0] = var4;
      return var1;
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++c;
      if(var1 != null && var1.length == 3) {
         baa.a(var2, var1, -63);
      } else if(var0 >= 35) {
         if(null != var1 && var1.length == 4) {
            OpenGL.glFramebufferTexture2DEXT('\u8d40', var2, ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[2], ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[0], ((int[])((int[])var1[1]))[0]);
         } else if(null != var1 && -6 == ~var1.length) {
            bea.a(-97, var2, var1);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final Object[] a(Object[] var0, int var1, int var2, int var3, boolean var4, int var5, ta var6, int var7, int var8, int var9, int var10, int var11, Object[] var12) {
      if(null == var12[8]) {
         var12[8] = new boolean[7];
      }

      ++e;
      if(var2 < 114) {
         a(-96, 79, -107, ((int[])((int[])var12[0]))[2]);
      }

      int var19;
      if(var3 != 1 && 3 != var3) {
         var19 = vla.b[var10 & 3];
      } else {
         var19 = wr.j[var10 & 3];
      }

      ps.a(var11, var5, var12, var8, false, var9, var1, var19);
      if(null != var12 && -6 == ~var12.length) {
         return null;
      } else {
         tga.a(var12, (byte)-121);
         var12[19] = pga.a(var3, var4, var0, ((byte[])((byte[])var12[10]))[0], new Object[11], var10, var7, -127, var9, var6, var12);
         ((boolean[])((boolean[])var12[8]))[5] = ((int[])((int[])var0[1]))[11] != 0 && !var4;
         toa.a(1, var12, 5029);
         return var12;
      }
   }

}
