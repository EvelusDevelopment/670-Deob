import java.io.IOException;

final class rra {

   static int c;
   static int b;
   static int d;
   static int f;
   static int e;
   static int a;


   static final void a(int var0) {
      ++a;
      if(var0 == 1) {
         ni var1;
         ni var2;
         for(Object[] var3 = (var1 = (ni)dda.a(ssa.d, 2)) != null?var1.t:null; var3 != null; var3 = null != (var2 = (ni)client.a(ssa.d, -28280))?var2.t:null) {
            if(wga.a(((int[])((int[])var3[1]))[1], (byte)117)) {
               Class_h.b((byte)91, var3);
            }
         }

      }
   }

   static final void a(byte[] var0, int var1, Object[] var2, int var3, int var4) throws IOException {
      ++c;

      try {
         if(((long[])((long[])var2[4]))[3] < (long)var1 + ((long[])((long[])var2[4]))[4]) {
            ((long[])((long[])var2[4]))[3] = ((long[])((long[])var2[4]))[4] - -((long)var1);
         }

         if(((long[])((long[])var2[4]))[5] != -1L && (((long[])((long[])var2[4]))[5] > ((long[])((long[])var2[4]))[4] || ~((long)((int[])((int[])var2[1]))[0] + ((long[])((long[])var2[4]))[5]) > ~((long[])((long[])var2[4]))[4])) {
            qs.a(var2, (int)10);
         }

         if(-1L != ((long[])((long[])var2[var3]))[5] && ~(((long[])((long[])var2[4]))[5] - -((long)((byte[])((byte[])var2[3])).length)) > ~(((long[])((long[])var2[4]))[4] + (long)var1)) {
            int var5 = (int)((long)((byte[])((byte[])var2[3])).length + ((long[])((long[])var2[4]))[5] + -((long[])((long[])var2[4]))[4]);
            System.arraycopy(var0, var4, var2[3], (int)(-((long[])((long[])var2[4]))[5] + ((long[])((long[])var2[4]))[4]), var5);
            ((long[])((long[])var2[4]))[4] += (long)var5;
            var4 += var5;
            var1 -= var5;
            ((int[])((int[])var2[1]))[0] = ((byte[])((byte[])var2[3])).length;
            qs.a(var2, (int)10);
         }

         if(((byte[])((byte[])var2[3])).length >= var1) {
            if(var1 > 0) {
               if(((long[])((long[])var2[4]))[5] == -1L) {
                  ((long[])((long[])var2[4]))[5] = ((long[])((long[])var2[4]))[4];
               }

               System.arraycopy(var0, var4, var2[3], (int)(-((long[])((long[])var2[4]))[5] + ((long[])((long[])var2[4]))[4]), var1);
               ((long[])((long[])var2[4]))[4] += (long)var1;
               if((long)((int[])((int[])var2[1]))[0] < -((long[])((long[])var2[4]))[5] + ((long[])((long[])var2[4]))[4]) {
                  ((int[])((int[])var2[1]))[0] = (int)(-((long[])((long[])var2[4]))[5] + ((long[])((long[])var2[4]))[4]);
               }

            }
         } else {
            if(~((long[])((long[])var2[4]))[4] != ~((long[])((long[])var2[4]))[0]) {
               dm.a(((long[])((long[])var2[4]))[4], 1, (Object[])((Object[])var2[2]));
               ((long[])((long[])var2[4]))[0] = ((long[])((long[])var2[4]))[4];
            }

            mr.a(var4, (Object[])((Object[])var2[2]), 19444, var0, var1);
            ((long[])((long[])var2[4]))[0] += (long)var1;
            if(((long[])((long[])var2[4]))[2] < ((long[])((long[])var2[4]))[0]) {
               ((long[])((long[])var2[4]))[2] = ((long[])((long[])var2[4]))[0];
            }

            long var11 = -1L;
            long var7 = -1L;
            if(~((long[])((long[])var2[4]))[1] >= ~((long[])((long[])var2[4]))[4] && ~(((long[])((long[])var2[4]))[1] - -((long)((int[])((int[])var2[1]))[1])) < ~((long[])((long[])var2[4]))[4]) {
               var11 = ((long[])((long[])var2[4]))[4];
            } else if(~((long[])((long[])var2[4]))[4] >= ~((long[])((long[])var2[4]))[1] && ~((long)var1 + ((long[])((long[])var2[4]))[4]) < ~((long[])((long[])var2[4]))[1]) {
               var11 = ((long[])((long[])var2[4]))[1];
            }

            if(~(((long[])((long[])var2[4]))[4] - -((long)var1)) < ~((long[])((long[])var2[4]))[1] && ~((long)((int[])((int[])var2[1]))[1] + ((long[])((long[])var2[4]))[1]) <= ~(((long[])((long[])var2[4]))[4] + (long)var1)) {
               var7 = ((long[])((long[])var2[4]))[4] + (long)var1;
            } else if(~((long)((int[])((int[])var2[1]))[1] + ((long[])((long[])var2[4]))[1]) < ~((long[])((long[])var2[4]))[4] && (long)((int[])((int[])var2[1]))[1] + ((long[])((long[])var2[4]))[1] <= ((long[])((long[])var2[4]))[4] - -((long)var1)) {
               var7 = ((long[])((long[])var2[4]))[1] + (long)((int[])((int[])var2[1]))[1];
            }

            if(var2 != null && var2.length == 4) {
               mea.a((byte)-62, (Object[])null);
            }

            if(0L > ~var11 && ~var11 > ~var7) {
               int var9 = (int)(-var11 + var7);
               System.arraycopy(var0, (int)(-((long[])((long[])var2[4]))[4] + ((long)var4 - -var11)), var2[0], (int)(var11 + -((long[])((long[])var2[4]))[1]), var9);
            }

            ((long[])((long[])var2[4]))[4] += (long)var1;
         }
      } catch (IOException var10) {
         ((long[])((long[])var2[4]))[0] = -1L;
         throw var10;
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++b;
      if(var0 > 55) {
         ((boolean[])((boolean[])var1[0]))[1] = false;
         ((boolean[])((boolean[])var1[0]))[0] = false;
         ((int[])((int[])var1[1]))[4] = 1;
         ((int[])((int[])var1[1]))[3] = 2;
         ((int[])((int[])var1[1]))[0] = 64;
         ((int[])((int[])var1[1]))[1] = -1;
         ((int[])((int[])var1[1]))[2] = 64;
      }
   }

   static final void b(int var0) {
      if(var0 == 10590) {
         ++d;

         ew var1;
         ew var2;
         Object[] var5;
         for(var5 = null != (var1 = (ew)dda.a(rga.f, var0 ^ 10588))?var1.k:null; var5 != null; var5 = (var2 = (ew)client.a(rga.f, var0 + -38870)) == null?null:var2.k) {
            Class_h.a(false, false, var5);
         }

         if(var5 != null && 9 == var5.length && var5[7].equals(Integer.valueOf(1))) {
            pf.j = null;
         }

         ew var3;
         ew var4;
         for(var5 = (var3 = (ew)dda.a(pf.j, 2)) == null?null:var3.k; null != var5; var5 = (var4 = (ew)client.a(pf.j, -28280)) != null?var4.k:null) {
            Class_h.a(false, true, var5);
         }

      }
   }

   static final float a(Object[] var0, float var1, byte var2) {
      ++e;
      if(var0 != null && 8 == var0.length) {
         return var1;
      } else if(null != var0 && var0.length == 11) {
         return bsa.a(var1, var0, (byte)-51);
      } else if(null != var0 && -16 == ~var0.length) {
         float var3 = gaa.a(var0, var1, (byte)-73);
         return var3;
      } else if(null != var0 && (-11 == ~var0.length || -16 == ~var0.length)) {
         return jja.a((byte)96, var0, var1);
      } else {
         if(var2 > -57) {
            ((boolean[])((boolean[])var0[2]))[7] = true;
         }

         throw new IllegalStateException();
      }
   }

}
