
final class dfa {

   static int j;
   static long[] s;
   static Object[] a;
   static int h;
   static int c;
   static int n;
   static int g;
   static Object[] LOGINSERVERPACKET = nb.newPacket(0, 14);
   static Object[] UPDATESERVERPACKET = nb.newPacket(8, 15);
   static Object[] LOGINRESPONSEPACKET = nb.newPacket(-2, 16);
   static Object[] LOBBYSERVERPACKET = nb.newPacket(-2, 19);
   static Object[] f_i = nb.newPacket(-2, 22);
   static int r;
   static Object[] o = nb.newPacket(4, 23);
   static Object[] q = nb.newPacket(-1, 24);
   static Object[] f = nb.newPacket(0, 26);
   static Object[] d = nb.newPacket(0, 27);
   static Object[] m = nb.newPacket(-2, 28);
   static Object[] b = nb.newPacket(-2, 29);
   static Object[] t = nb.newPacket(-2, 30);
   private static Object[][] p = new Object[32][];


   static final ii a(Object[] var0, Object[] var1, boolean var2, boolean var3) {
      ++h;
      int var4;
      int var5;
      int var6;
      if(var2) {
         if(var0 != null && null != var0[1]) {
            var6 = ((int[])((int[])var0[1]))[2];
            var5 = ((int[])((int[])var0[1]))[1];
            var4 = ((int[])((int[])var0[1]))[0];
         } else {
            var5 = ((int[])((int[])var1[1]))[5];
            var6 = ((int[])((int[])var1[1]))[37];
            var4 = ((int[])((int[])var1[1]))[1];
         }
      } else if(var0 != null && null != var0[4]) {
         var6 = ((int[])((int[])var0[4]))[2];
         var5 = ((int[])((int[])var0[4]))[1];
         var4 = ((int[])((int[])var0[4]))[0];
      } else {
         var4 = ((int[])((int[])var1[1]))[21];
         var5 = ((int[])((int[])var1[1]))[23];
         var6 = ((int[])((int[])var1[1]))[24];
      }

      if(var4 == -1) {
         return null;
      } else {
         ii var7 = ii.a((Object[])((Object[])((Object[])((Object[])var1[7]))[7]), var4, (int)0);
         if(var7 == null) {
            return null;
         } else if(var3) {
            return (ii)null;
         } else {
            if(var7.a < 13) {
               var7.a(2);
            }

            if(var5 != -1) {
               ii var8 = ii.a((Object[])((Object[])((Object[])((Object[])var1[7]))[7]), var5, (int)0);
               if(13 > var8.a) {
                  var8.a(2);
               }

               if(var6 == -1) {
                  ii[] var9 = new ii[]{var7, var8};
                  var7 = new ii(var9, 2);
               } else {
                  ii var12 = ii.a((Object[])((Object[])((Object[])((Object[])var1[7]))[7]), var6, (int)0);
                  if(var12.a < 13) {
                     var12.a(2);
                  }

                  ii[] var10 = new ii[]{var7, var8, var12};
                  var7 = new ii(var10, 3);
               }
            }

            if(!var2 && (0 != ((int[])((int[])var1[1]))[34] || -1 != ~((int[])((int[])var1[1]))[43] || ((int[])((int[])var1[1]))[19] != 0)) {
               var7.b(((int[])((int[])var1[1]))[34], ((int[])((int[])var1[1]))[43], ((int[])((int[])var1[1]))[19]);
            }

            if(var2 && (((int[])((int[])var1[1]))[20] != 0 || 0 != ((int[])((int[])var1[1]))[36] || ((int[])((int[])var1[1]))[28] != 0)) {
               var7.b(((int[])((int[])var1[1]))[20], ((int[])((int[])var1[1]))[36], ((int[])((int[])var1[1]))[28]);
            }

            short[] var11;
            int var13;
            if(var1[14] != null) {
               if(var0 != null && var0.length == 2 && var0[1].equals(Integer.valueOf(1)) && var0[1].equals(Integer.valueOf(2))) {
                  la.b = null;
               }

               if(var0 != null && null != var0[5]) {
                  var11 = (short[])((short[])var0[5]);
               } else {
                  var11 = (short[])((short[])var1[0]);
               }

               for(var13 = 0; ((short[])((short[])var1[14])).length > var13; ++var13) {
                  var7.b(((short[])((short[])var1[14]))[var13], var11[var13]);
               }
            }

            if(var1[5] != null) {
               if(var0 != null && null != var0[0]) {
                  var11 = (short[])((short[])var0[0]);
               } else {
                  var11 = (short[])((short[])var1[13]);
               }

               for(var13 = 0; var13 < ((short[])((short[])var1[5])).length; ++var13) {
                  var7.a(((short[])((short[])var1[5]))[var13], var11[var13]);
               }
            }

            return var7;
         }
      }
   }

   static final void a(int var0, int var1, int var2, int var3, Object[] var4, int var5) {
      ++r;
      int var6;
      int var7;
      if(null == ((ta)var4[38]).E) {
         var7 = 0;
         var6 = 0;
      } else {
         var6 = ((ta)var4[38]).E.e();
         var7 = ((ta)var4[38]).E.d();
      }

      if(0 >= var0 && var6 - 1 <= var3 && var2 <= 0 && -1 + var7 <= var5) {
         loa.a((byte)-115, var4);
      } else {
         int var8 = 83 % ((-18 - var1) / 56);
         ((int[])((int[])var4[1]))[2] = var3 <= var6?var3:var6;
         ((int[])((int[])var4[1]))[16] = 0 > var0?0:var0;
         ((int[])((int[])var4[1]))[1] = var2 >= 0?var2:0;
         if(null == var4 || 24 != var4.length && 1 != var4.length) {
            ((int[])((int[])var4[1]))[26] = var7 >= var5?var5:var7;
            if(!((boolean[])((boolean[])var4[63]))[5]) {
               ((boolean[])((boolean[])var4[63]))[5] = true;
               bt.a(var4, true);
            }

            ima.a(var4, true);
         }
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ((int[])((int[])var1[0]))[0] = 0;
      ++j;
      ((int[])((int[])var1[0]))[var0] = var2;
   }

   static final void a(String var0, String var1, int var2) {
      if(var2 != 4) {
         d = (Object[])((Object[])((Object[])((Object[])f_i[1]))[21]);
      }

      ++g;
      if(-321 <= ~var0.length()) {
         if(od.a(var2 ^ 5)) {
            qca.f = "";
            ce.a = -1;
            fw.b = 0L;
            tba.c = var0;
            bm.f = var1;
            iea.a(12, (byte)-67);
         }
      }
   }

   static final ka a(int var0, int var1, Object[] var2, int var3, int var4, int var5, ii var6) {
      if(var5 != 27856) {
         return (ka)null;
      } else {
         ++c;
         return new hu(var2, var6, var4, var3, var1, var0);
      }
   }

   static final void a(Object[] var0, Object[] var1, byte var2) {
      if(var2 < -19) {
         ++n;
      }
   }

   static {
      Object[][] var0 = mb.a((byte)42);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         p[((int[])((int[])var0[var1][0]))[0]] = var0[var1];
      }

   }
}
