import java.util.Vector;

final class qn {

   static int d;
   static int f;
   static int b;
   static Object[] g = nb.a((byte)74, 16, new Object[5]);
   static int a;
   static int[] c = new int[32];
   static Object[] e = sd.a(new Object[1], 52, (byte)119);


   static final void a(Object[] var0, byte var1) {
      ++d;
      dj.a(false, (Object[])((Object[])var0[10]));
      aqa.a(0, (Object[])((Object[])var0[10]), 50);
      vha.a(-4, 1, (Object[])((Object[])var0[10]));
      loa.a((byte)-93, (Object[])((Object[])var0[10]));
      ((hsa)var0[2]).a((lua)null);
      if(null == var0 || (-8 != ~var0.length || !var0[6].equals(Integer.valueOf(2))) && (var0.length != 10 || !var0[2].equals(Boolean.valueOf(false))) && var0.length != 12) {
         ov.a(0, (byte)-126, (Object[])((Object[])var0[10]), 0);
         int var4 = ((Vector)var0[14]).size();
         Object[] var5 = (Object[])((Object[])var0[7]);
         if(null != var5 && -9 == ~var5.length) {
            bu.a(var5, -106);
         } else if(null != var5 && 11 == var5.length) {
            bu.a(var5, -110);
         } else if(null != var5 && -16 == ~var5.length) {
            qla.a(var1 + 21, var5);
         } else {
            if(var5 == null || 15 != var5.length && var5.length != 10) {
               throw new IllegalStateException();
            }

            if(null != var5 && var5.length == 15) {
               qla.a(56, var5);
            }
         }

         if(var1 != 35) {
            c = (int[])null;
         }

         for(int var6 = 0; var6 < var4; ++var6) {
            Object[] var7 = (Object[])((Object[])((Vector)var0[14]).elementAt(var6));
            int var8 = wo.a(50, var7);
            if(var7 != null && (var7.length == 18 || var7.length == 12)) {
               return;
            }

            boolean var9 = ~var6 == ~(-1 + var4);

            for(int var10 = 0; var8 > var10; ++var10) {
               if(var9 && var10 == -1 + var8) {
                  Object[] var2;
                  ((ta)((var2 = (Object[])((Object[])var0[10])) != null?var2[38]:null)).a(true, (hsa)var0[2]);
               } else {
                  ((hsa)var0[2]).a(0, (re)var0[3]);
               }

               Object[] var11 = (Object[])((Object[])var0[13]);
               if(var10 == 0) {
                  var11 = (Object[])((Object[])var0[7]);
               }

               mfa.a(var11, var1 - 148, var10, (lua)var0[5], var7, (Object[])((Object[])var0[7]), (hsa)var0[2]);
               dk.a(var0, (byte)124);
               if(var7 == null) {
                  throw new IllegalStateException();
               }

               te.b(5, (Object[])((Object[])var7[4]));
               Object[] var3 = (Object[])((Object[])var0[13]);
               if(null != var0 && -2 == ~var0.length) {
                  dk.a((Object[])null, (byte)124);
               }

               var0[13] = var0[6];
               var0[6] = var3;
               re var12 = (re)var0[9];
               var0[9] = var0[3];
               var0[3] = var12;
            }
         }

      }
   }

   static final byte[] a(int var0, Object var1, int var2, int var3) {
      ++f;
      if(var1 == null) {
         return null;
      } else {
         if(var0 != 0) {
            c = (int[])null;
         }

         if(var1 instanceof byte[]) {
            byte[] var7 = (byte[])((byte[])var1);
            byte[] var6 = new byte[var3];
            System.arraycopy(var7, var2, var6, 0, var3);
            return var6;
         } else if(var1 instanceof Object[] && 26 == ((Object[])((Object[])var1)).length && -3 == ~((int[])((int[])((Object[])((Object[])var1))[1])).length && ((int[])((int[])((Object[])((Object[])var1))[1]))[1] == 1) {
            Object[] var4 = (Object[])((Object[])var1);
            return hta.a(var3, var2, (byte)109, var4);
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   static final ka a(int var0, ta var1, Object[] var2, byte var3, boolean var4, boolean var5) {
      ++b;
      Object[] var6 = mca.a(true, ((int[])((int[])var2[1]))[6], lja.d);
      if(var6[11] != null) {
         var6 = vs.a(0 == bw.b?qba.h:eo.g, var6, (byte)-84);
      }

      if(null == var6) {
         fla.a(var2, 101, var1);
         ((int[])((int[])var2[1]))[2] = -1;
         return null;
      } else {
         if(!((boolean[])((boolean[])var2[8]))[2] && ~((int[])((int[])var6[1]))[13] != ~((int[])((int[])var2[1]))[2]) {
            et.a(true, -1, var2, 3, 0);
            var2[0] = null;
            ((boolean[])((boolean[])var2[8]))[1] = false;
         }

         if(wna.a((Object[])((Object[])var2[3]), var3 + 59)) {
            if(iha.a(kda.d - ((int[])((int[])var2[1]))[4], (byte)-108, (Object[])((Object[])var2[3]))) {
               if(ft.a((Object[])((Object[])tu.d[13]), var3 - 14017) == 2) {
                  ((boolean[])((boolean[])var2[8]))[1] = false;
               }

               if(ela.a((Object[])((Object[])var2[3]), 3)) {
                  rs.a(-1, (Object[])((Object[])var2[3]), 125);
                  ((boolean[])((boolean[])var2[8]))[2] = false;
                  et.a(false, -1, var2, var3 ^ -54, 0);
               }
            }
         } else {
            et.a(false, -1, var2, var3 + 58, 0);
         }

         ((int[])((int[])var2[1]))[4] = kda.d;
         if(var4) {
            var4 &= ((boolean[])((boolean[])var2[8]))[3] & !((boolean[])((boolean[])var2[8]))[1] & -1 != ~ft.a((Object[])((Object[])tu.d[13]), (int)-14072);
         }

         if(var5 && !var4) {
            ((int[])((int[])var2[1]))[2] = ((int[])((int[])var6[1]))[13];
            return null;
         } else {
            Object[] var7 = (Object[])((Object[])woa.a(5, (Object[])((Object[])var2[2]))[1]);
            if(var3 != -55) {
               e = (Object[])null;
            }

            if(var4) {
               wg.a((ya)var2[5], ((byte[])((byte[])var2[4]))[1], (int)((float[])((float[])var7[1]))[2], (int)((float[])((float[])var7[1]))[1], (boolean[])((boolean[])var2[9]));
               ((boolean[])((boolean[])var2[8]))[1] = false;
            }

            aa var8 = jp.o[((byte[])((byte[])var2[4]))[1]];
            aa var9;
            if(!((boolean[])((boolean[])var2[8]))[0]) {
               var9 = ((byte[])((byte[])var2[4]))[1] < 3?jp.o[((byte[])((byte[])var2[4]))[1] + 1]:null;
            } else {
               var9 = bf.f_l[0];
            }

            ka var10 = null;
            if(!wna.a((Object[])((Object[])var2[3]), var3 + 59)) {
               if(var2[0] != null && (((ka)var2[0]).va() & var0) == var0 && ((int[])((int[])var6[1]))[13] == ((int[])((int[])var2[1]))[2]) {
                  var10 = (ka)var2[0];
               } else {
                  if(var2[0] != null) {
                     var0 |= ((ka)var2[0]).va();
                  }

                  Object[] var11 = lq.a(var9, var0, var8.a(1, (int)((float[])((float[])var7[1]))[2], (int)((float[])((float[])var7[1]))[1]), var4, 15790, (int)((float[])((float[])var7[1]))[1], (int)((float[])((float[])var7[1]))[2], var1, var8, (Object[])((Object[])var2[7]), var6, 11 == ((int[])((int[])var2[1]))[3]?10:((int[])((int[])var2[1]))[3], -12 == ~((int[])((int[])var2[1]))[3]?((int[])((int[])var2[1]))[5] + 4:((int[])((int[])var2[1]))[5]);
                  if(var11 != null) {
                     var2[0] = var10 = (ka)var11[1];
                     if(var4) {
                        var2[5] = var11[0];
                        var2[9] = null;
                        bi.a((ya)var2[5], ((byte[])((byte[])var2[4]))[1], (int)((float[])((float[])var7[1]))[2], (int)((float[])((float[])var7[1]))[1], (boolean[])null);
                        ((boolean[])((boolean[])var2[8]))[1] = true;
                     }

                     ((int[])((int[])var2[1]))[1] = var10.pa();
                     ((int[])((int[])var2[1]))[0] = var10.ra();
                  } else {
                     var2[9] = null;
                     var2[0] = null;
                     ((int[])((int[])var2[1]))[0] = 0;
                     var2[5] = null;
                     ((int[])((int[])var2[1]))[1] = 0;
                  }
               }
            } else {
               if(var4) {
                  var0 |= 262144;
               }

               var10 = ala.a(var6, (Object[])((Object[])var2[7]), ((int[])((int[])var2[1]))[3] == 11?((int[])((int[])var2[1]))[5] + 4:((int[])((int[])var2[1]))[5], var0, var8, (int)((float[])((float[])var7[1]))[1], -12 == ~((int[])((int[])var2[1]))[3]?10:((int[])((int[])var2[1]))[3], var1, 0, var9, (Object[])((Object[])var2[3]), (int)((float[])((float[])var7[1]))[2], var8.a(1, (int)((float[])((float[])var7[1]))[2], (int)((float[])((float[])var7[1]))[1]));
               if(null == var10) {
                  var2[9] = null;
                  ((int[])((int[])var2[1]))[1] = 0;
                  var2[5] = null;
                  ((int[])((int[])var2[1]))[0] = 0;
               } else {
                  if(var4) {
                     if(null == var2[9]) {
                        var2[9] = new boolean[4];
                     }

                     var2[5] = var10.p((ya)var2[5]);
                     bi.a((ya)var2[5], ((byte[])((byte[])var2[4]))[1], (int)((float[])((float[])var7[1]))[2], (int)((float[])((float[])var7[1]))[1], (boolean[])((boolean[])var2[9]));
                     ((boolean[])((boolean[])var2[8]))[1] = true;
                  }

                  ((int[])((int[])var2[1]))[1] = var10.pa();
                  ((int[])((int[])var2[1]))[0] = var10.ra();
               }

               var2[0] = null;
            }

            ((int[])((int[])var2[1]))[2] = ((int[])((int[])var6[1]))[13];
            return var10;
         }
      }
   }

   static final byte[] a(int var0, int var1, Object[] var2, int var3) {
      int var4 = 73 % ((4 - var3) / 35);
      ++a;
      return mn.a((int[])null, var1, var0, (byte)44, var2);
   }

}
