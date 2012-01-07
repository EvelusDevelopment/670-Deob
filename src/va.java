import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;

class va extends nj {

   static int t;
   va k;
   static int o;
   static int f_i;
   static int j;
   static int n;
   static int r;
   static int f_l;
   static int q;
   va p;
   static int s;
   static int u;
   static int[][][] m;


   static final Object[] a(int var0, Object[] var1, int var2, int var3, int var4, byte var5, int var6, int var7) {
      if(null == var1[14]) {
         var1[14] = new short[1];
      }

      ++t;
      ct.a(var1, true);
      ((byte[])((byte[])var1[10]))[0] = (byte)var6;
      ((short[])((short[])var1[14]))[0] = (short)var3;
      ((byte[])((byte[])var1[10]))[1] = (byte)var4;
      sra.a(var1, bl.a((byte)-101, (float)var0, new Object[2], (float)var7, (float)var2), 1);
      if(var5 < 71) {
         ((Object[])((Object[])var1[2]))[6] = (Object)null;
      }

      return var1;
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      ++o;
      if(var1[0] == null) {
         var1[0] = new int[4];
      }

      sea.b(var0, var1, (byte)-122);
      ((int[])((int[])var1[0]))[2] = de.a((int)0, var0);
      var1[2] = ara.b((byte)61, var0);
      int var3 = -27 / ((-41 - var2) / 38);
      ((int[])((int[])var1[0]))[3] = lr.a(1, var0);
      ((int[])((int[])var1[0]))[1] = de.a((int)0, var0);
      return var1;
   }

   static final int b(Object[] var0, byte var1) throws IOException {
      ++s;
      if(var1 <= 15) {
         m = (int[][][])((int[][][])var0[0]);
      }

      if(var0 != null) {
         Object[] var4 = (Object[])((Object[])var0[2]);
         int var3;
         synchronized(var4 != null?var4[2]:null) {
            int var7;
            label29: {
               if(((int[])((int[])var4[1]))[2] >= ((int[])((int[])var4[1]))[1]) {
                  var7 = -((int[])((int[])var4[1]))[1] + ((int[])((int[])var4[1]))[2];
                  if(client.f_vb == 0) {
                     break label29;
                  }
               }

               var7 = ((int[])((int[])var4[1]))[2] + ((int[])((int[])var4[1]))[0] - ((int[])((int[])var4[1]))[1];
            }

            if(null != var4[3]) {
               throw new IOException(((Throwable)var4[3]).toString());
            }

            var3 = var7;
            var4[2].notifyAll();
         }

         return var3;
      } else {
         throw new IllegalStateException();
      }
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2, Object[] var3) {
      ++n;
      if(~((int[])((int[])var2[1]))[29] == 0) {
         return null;
      } else {
         long var4 = 65535L & (long)((int[])((int[])var2[1]))[29] | -281474976710656L & (long)((int[])((int[])var2[1]))[33] << 48 | 281470681743360L & (long)((int[])((int[])var2[1]))[22] << 32 | 4294901760L & (long)((int[])((int[])var2[1]))[26] << 16;
         Object[] var6 = (Object[])((Object[])dna.a((byte)34, Class_ls.m, var4));
         if(var1 <= 37) {
            ((boolean[])((boolean[])var3[0]))[5] = ((boolean[])((boolean[])((Object[])((Object[])var2[3]))[21]))[13];
         }

         if(null == var6) {
            var6 = lga.a(-117, ((int[])((int[])var2[1]))[29], ((int[])((int[])var2[1]))[33], var0, ((int[])((int[])var2[1]))[22], ((int[])((int[])var2[1]))[26], var3);
            il.a(var4, var6, true, Class_ls.m);
         }

         return var6;
      }
   }

   static final void a(int var0, int var1, int var2, int var3) {
      ++j;
      Object[] var4 = la.a(var0, (long)var3, 9);
      jqa.a((byte)123, var4);
      ((int[])((int[])var4[0]))[2] = var2;
      ((int[])((int[])var4[0]))[1] = var1;
   }

   static final int a(Object[] var0, byte var1) {
      ++r;
      int var2 = 61 % ((3 - var1) / 60);
      return ((int[])((int[])var0[7]))[qr.a(true, (Object[])((Object[])var0[8]))];
   }

   static final void b(int var0) {
      ++f_l;
      client var1 = kqa.h;
      synchronized(kqa.h) {
         if(var0 == -32144) {
            if(gf.b == null) {
               Object var2;
               if(null != opa.g) {
                  var2 = opa.g;
               } else {
                  var2 = kqa.h;
               }

               rp.a = ((Container)var2).getSize().width;
               jma.h = ((Container)var2).getSize().height;
               Insets var3;
               if(var2 == opa.g) {
                  var3 = opa.g.getInsets();
                  jma.h -= var3.top + var3.bottom;
                  rp.a -= var3.right + var3.left;
               }

               if(afa.b((byte)-85) == 1) {
                  nma.a = qga.j;
                  mr.e = 0;
                  wr.n = iia.r;
                  pa.f_i = (-iia.r + rp.a) / 2;
               } else {
                  bo.a((byte)-120);
               }

               if(mka.g != po.f_i && wr.n < 1024 && 768 > nma.a) {
                  ;
               }

               ru.d.setSize(wr.n, nma.a);
               if(null != lna.g) {
                  lna.g.a(nma.a, ru.d, wr.n, true);
               }

               if(opa.g == var2) {
                  var3 = opa.g.getInsets();
                  ru.d.setLocation(pa.f_i + var3.left, mr.e + var3.top);
               } else {
                  ru.d.setLocation(pa.f_i, mr.e);
               }

               if(~bqa.j != 0) {
                  kt.a(true, nma.a, (byte)126, bqa.j, wr.n);
               }

               eoa.a(-117);
            }
         }
      }
   }

   final void a(byte var1) {
      ++u;
      if(this.k != null) {
         if(var1 != -98) {
            a((Object[])null, (byte)-91);
         }

         this.k.p = this.p;
         this.p.k = this.k;
         this.p = null;
         this.k = null;
      }
   }

   static final Object[] a(Object[] var0, int var1) {
      ++q;
      Object[] var3;
      Object[] var5;
      if(var0 != null && (8 <= var0.length && var0.length <= 10 || -5 <= ~var0.length && var0.length >= 3)) {
         if(null != var0 && var0.length == 4) {
            var3 = ld.e;
            var5 = var3;
         } else if(var0 != null && var0.length <= 9 && var0.length >= 7) {
            var5 = gpa.a(var0, (byte)-44);
         } else if(null != var0 && -11 == ~var0.length) {
            var5 = jta.a(var0, (byte)119);
         } else {
            var3 = null;
            var5 = var3;
         }

         return var5;
      } else if(null != var0 && var0.length == 5) {
         var5 = jta.e;
         return var5;
      } else {
         int var2 = 40 % ((var1 + 49) / 63);
         if(var0 != null && -8 <= ~var0.length && 6 <= var0.length) {
            if(null != var0 && var0.length == 7) {
               Object[] var4 = nt.j;
               var3 = var4;
            } else {
               var3 = gfa.a(0, var0);
            }

            return var3;
         } else if(null != var0 && 11 == var0.length) {
            return nga.a((byte)119, var0);
         } else if(var0 != null && var0.length == 1) {
            var3 = we.d;
            return var3;
         } else if(null != var0 && var0.length == 2) {
            var3 = no.a;
            return var3;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2, int var3, int var4) {
      if(var2[0] == null) {
         var2[0] = new int[14];
      }

      ++f_i;
      sea.b(var1, var2, (byte)-125);
      int var5 = -100 % ((var0 - 83) / 37);
      int var6;
      if(0 == var3) {
         var6 = lr.a(1, var1);
         ((int[])((int[])var2[0]))[5] = var6 & '\uffff';
         ((int[])((int[])var2[0]))[7] = var6 >>> 16;
         ((int[])((int[])var2[0]))[11] = -1;
      } else {
         ((int[])((int[])var2[0]))[7] = -1;
         ((int[])((int[])var2[0]))[5] = -1;
         ((int[])((int[])var2[0]))[11] = de.a((int)0, var1);
      }

      if(var4 == 0) {
         var6 = lr.a(1, var1);
         ((int[])((int[])var2[0]))[8] = -1;
         ((int[])((int[])var2[0]))[6] = var6 >>> 16;
         ((int[])((int[])var2[0]))[3] = var6 & '\uffff';
      } else {
         ((int[])((int[])var2[0]))[6] = -1;
         ((int[])((int[])var2[0]))[3] = -1;
         ((int[])((int[])var2[0]))[8] = de.a((int)0, var1);
      }

      if(0 == var3 && 0 == var4) {
         ((int[])((int[])var2[0]))[12] = fh.a(var1, false);
      } else {
         ((int[])((int[])var2[0]))[12] = -1;
      }

      ((int[])((int[])var2[0]))[1] = de.a((int)0, var1);
      ((int[])((int[])var2[0]))[2] = fh.a(var1, false);
      ((int[])((int[])var2[0]))[9] = fh.a(var1, false);
      ((int[])((int[])var2[0]))[13] = td.a(var1, 115);
      ((int[])((int[])var2[0]))[10] = de.a((int)0, var1);
      ((int[])((int[])var2[0]))[4] = fh.a(var1, false);
      if(null != var2 && -9 == ~var2.length) {
         a((byte)-124, new Object[7][], (Object[])null, 53, 107);
      }

      return var2;
   }

}
